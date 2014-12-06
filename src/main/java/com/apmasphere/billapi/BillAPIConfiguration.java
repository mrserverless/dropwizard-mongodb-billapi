package com.apmasphere.billapi;

import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by yun on 10/01/2014.
 */
public class BillAPIConfiguration extends Configuration {

    @Valid
    @NotNull
    public MongoConfiguration mongo = new MongoConfiguration();

}
