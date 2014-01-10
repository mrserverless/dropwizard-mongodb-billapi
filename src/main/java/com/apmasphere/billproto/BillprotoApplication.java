package com.apmasphere.billproto;

import com.apmasphere.billproto.conf.BillprotoConfiguration;
import com.apmasphere.billproto.db.MongoManaged;
import com.apmasphere.billproto.health.MongoHealthCheck;
import com.apmasphere.billproto.resources.BillResource;
import com.apmasphere.billproto.resources.SubscriptionResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by yun on 10/01/2014.
 */
public class BillprotoApplication extends Application<BillprotoConfiguration> {

    public static void main(String[] args) throws Exception {
        new BillprotoApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<BillprotoConfiguration> bootstrap) {


    }

    @Override
    public void run(BillprotoConfiguration configuration, Environment environment) throws Exception {

        MongoManaged mongoManaged = new MongoManaged(configuration.getMongo());
        environment.lifecycle().manage(mongoManaged);
        environment.healthChecks().register("MongoHealthCheck", new MongoHealthCheck(mongoManaged));

        environment.jersey().register(new SubscriptionResource(mongoManaged));
        environment.jersey().register(new BillResource(mongoManaged));

    }
}
