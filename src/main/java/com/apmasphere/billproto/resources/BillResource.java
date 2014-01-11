package com.apmasphere.billproto.resources;

import com.apmasphere.billproto.db.MongoManaged;
import com.apmasphere.billproto.models.bill.Bill;
import com.codahale.metrics.annotation.Timed;
import org.mongojack.DBCursor;
import org.mongojack.JacksonDBCollection;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import static org.mongojack.JacksonDBCollection.wrap;

/**
 * Created by yun on 10/01/2014.
 */
@Path("/bill/")
public class BillResource {

    private JacksonDBCollection<Bill, String> bills;

    public BillResource (MongoManaged mongoManaged) {

        this.bills =
                wrap(mongoManaged.getDb().getCollection("bill"), Bill.class, String.class);

    }

    @GET()
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public Bill getBill(@QueryParam("billID") String billID) {

        Bill result = null;

        DBCursor<Bill> cursor = bills.find().is("_id", billID);
        if (cursor.hasNext()) {
            result =  cursor.next();
        }
        return result;
    }
}
