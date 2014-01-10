package com.apmasphere.billproto.resources;

import com.apmasphere.billproto.db.MongoManaged;
import com.apmasphere.billproto.models.bill.Notification;
import com.apmasphere.billproto.models.subscription.Subscription;
import com.codahale.metrics.annotation.Timed;
import org.mongojack.DBCursor;
import org.mongojack.JacksonDBCollection;

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
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SubscriptionResource {

    private JacksonDBCollection<Subscription, String> subscriptions;

    public SubscriptionResource (MongoManaged mongoManaged) {

        this.subscriptions =
                wrap(mongoManaged.getDb().getCollection("subscription"), Subscription.class, String.class);

    }

    @PUT
    @Timed
    public Response createSubscription(Subscription sub) {
        DBCursor<Subscription> cursor = subscriptions.find().is("subscriptionId", sub.subscriptionID);
        if (cursor.hasNext()) {
            return Response.status(Response.Status.CONFLICT).build();
        }

        subscriptions.save(sub);

        return Response.status(Response.Status.ACCEPTED).build();
    }

    @GET
    @Timed
    public Notification triggerNotification(@PathParam("subscriptionID") String subscriptionID) {
        Notification notification = null;

        DBCursor<Subscription> cursor = subscriptions.find().is("subscriptionId", subscriptionID);
        if (cursor.hasNext()) {
            Subscription subscription = cursor.next();

            notification = new Notification();

            notification.notificationID = UUID.randomUUID().toString();
            notification.subscriptionID = subscriptionID;
            notification.premiseAPIGeneratedID = subscription.getSubscriptionForPremiseAPIGeneratedID();
            notification.providerAPIGeneratedID = subscription.getSubscriptionForProviderAPIGeneratedID();

        }

        return notification;

    }

}
