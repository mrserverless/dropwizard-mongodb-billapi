package com.apmasphere.billapi.db;

import com.apmasphere.billapi.MongoConfiguration;
import com.mongodb.DB;
import com.mongodb.Mongo;
import io.dropwizard.lifecycle.Managed;

/**
 * Created by yun on 10/01/2014.
 */
public class MongoManaged implements Managed {

    private Mongo mongo;
    private DB db;

    public MongoManaged (MongoConfiguration mongoConfig) throws Exception {

        this.mongo = new Mongo(mongoConfig.host, mongoConfig.port);
        this.db = mongo.getDB(mongoConfig.db);
        db.authenticate(mongoConfig.user, mongoConfig.password.toCharArray());

    }


    @Override
    public void start() throws Exception {

    }

    @Override
    public void stop() throws Exception {
        this.mongo.close();
    }

    public Mongo getMongo() {
        return mongo;
    }

    public DB getDb() {
        return db;
    }
}
