package com.apmasphere.billproto.conf;

import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by yun on 10/01/2014.
 */
public class BillprotoConfiguration extends Configuration {

    @Valid
    @NotNull
    public MongoConfiguration mongo = new MongoConfiguration();

}
