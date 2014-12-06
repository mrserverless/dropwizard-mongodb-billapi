package com.apmasphere.billapi.health;

import com.apmasphere.billapi.db.MongoManaged;
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
            mongo.getDb();
            return Result.healthy();
        }

}
