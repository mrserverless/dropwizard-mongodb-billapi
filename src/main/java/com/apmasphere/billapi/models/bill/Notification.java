package com.apmasphere.billapi.models.bill;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.mongojack.Id;

import javax.validation.constraints.NotNull;

/**
 * Created by yun on 10/01/2014.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Notification {

    @Id
    public String notificationID;

    @NotNull
    public String subscriptionID;

    public String premiseAPIGeneratedID;
    public String providerAPIGeneratedID;
    public String notificationType;
    public String notificationCreatedDateTime;

    @NotNull
    public String notificationURLForBillDataRetrival;

    @NotNull
    public String notificationURLForBillImageRetrival;

}
