package com.apmasphere.billapi.resources;

import com.apmasphere.billapi.db.MongoManaged;
import com.apmasphere.billapi.models.bill.Notification;
import com.apmasphere.billapi.models.subscription.Subscription;
import com.codahale.metrics.annotation.Timed;
import org.mongojack.DBCursor;
import org.mongojack.JacksonDBCollection;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

import static org.mongojack.JacksonDBCollection.wrap;

/**
 * supports PUT operation to create a Subscription
 *
 * Created by yun on 10/01/2014.
 */

@Path("/subscription/")
public class SubscriptionResource {

    private JacksonDBCollection<Subscription, String> subscriptions;

    public SubscriptionResource (MongoManaged mongoManaged) {

        this.subscriptions =
                wrap(mongoManaged.getDb().getCollection("subscription"), Subscription.class, String.class);

    }

    @PUT
    @Timed
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createSubscription(@Valid Subscription sub) {
        DBCursor<Subscription> cursor = subscriptions.find().is("_id", sub.subscriptionID);
        if (cursor.hasNext()) {
            return Response.status(Response.Status.CONFLICT).build();
        }

        subscriptions.save(sub);

        return Response.status(Response.Status.ACCEPTED).build();
    }

    @GET
    @Timed
    @Path("trigger/{subscriptionID}/{billID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Notification triggerNotification(@PathParam("subscriptionID") String subscriptionID,
                                            @PathParam("billID") String billID) {
        Notification notification = null;

        DBCursor<Subscription> cursor = subscriptions.find().is("_id", subscriptionID);
        if (cursor.hasNext()) {
            Subscription subscription = cursor.next();

            notification = new Notification();

            notification.notificationID = UUID.randomUUID().toString();
            notification.subscriptionID = subscriptionID;
            notification.notificationURLForBillDataRetrival = subscription.subscriptionCallBackURL +
                    "?billID=" + billID;
        }

        return notification;

    }

}
