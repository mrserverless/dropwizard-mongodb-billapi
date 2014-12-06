package com.apmasphere.billapi;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by yun on 10/01/2014.
 */
public class MongoConfiguration {

    @NotNull
    public String host;

    @Min(1)
    @Max(65535)
    public int port;

    @NotNull
    public String db;

    @NotNull
    public String user;

    @NotNull
    public String password;

}
