package com.apmasphere.billproto.conf;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by yun on 10/01/2014.
 */
public class BillprotoConfiguration extends Configuration {

    @Valid
    @NotNull
    @JsonProperty
    private MongoConfiguration mongo = new MongoConfiguration();

    public MongoConfiguration getMongo() {
        return mongo;
    }
}
