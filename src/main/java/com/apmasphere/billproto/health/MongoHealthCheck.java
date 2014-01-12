package com.apmasphere.billproto.health;

import com.apmasphere.billproto.db.MongoManaged;
import com.codahale.metrics.health.HealthCheck;

/**
 * Created by yun on 10/01/2014.
 */
public class MongoHealthCheck extends HealthCheck {

        private MongoManaged mongo;

        public MongoHealthCheck(MongoManaged mongoManaged) {
            this.mongo = mongoManaged;
        }

        @Override
        protected Result check() throws Exception {
            mongo.getDb().getCollectionNames();
            return Result.healthy();
        }

}
