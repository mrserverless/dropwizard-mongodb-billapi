package com.apmasphere.billproto.health;

import com.apmasphere.billproto.db.MongoManaged;
import com.codahale.metrics.health.HealthCheck;
import com.mongodb.Mongo;

/**
 * Created by yun on 10/01/2014.
 */
public class MongoHealthCheck extends HealthCheck {

        private Mongo mongo;

        public MongoHealthCheck(MongoManaged mongoManaged) {
            this.mongo = mongoManaged.getMongo();
        }

        @Override
        protected Result check() throws Exception {
            mongo.getVersion();
            return Result.healthy();
        }

}
