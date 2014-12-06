package com.apmasphere.billapi;

import com.apmasphere.billapi.db.MongoManaged;
import com.apmasphere.billapi.health.MongoHealthCheck;
import com.apmasphere.billapi.resources.BillResource;
import com.apmasphere.billapi.resources.SubscriptionResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by yun on 10/01/2014.
 */
public class BillAPI extends Application<BillAPIConfiguration> {

    public static void main(String[] args) throws Exception {
        new BillAPI().run(args);
    }

    @Override
    public void initialize(Bootstrap<BillAPIConfiguration> bootstrap) {


    }

    @Override
    public void run(BillAPIConfiguration configuration, Environment environment) throws Exception {

        MongoManaged mongoManaged = new MongoManaged(configuration.mongo);
        environment.lifecycle().manage(mongoManaged);
        environment.healthChecks().register("MongoHealthCheck", new MongoHealthCheck(mongoManaged));

        environment.jersey().register(new SubscriptionResource(mongoManaged));
        environment.jersey().register(new BillResource(mongoManaged));

    }
}
