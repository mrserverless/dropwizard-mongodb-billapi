package com.apmasphere.billproto.models.bill;

import org.mongojack.Id;

/**
 * Created by yun on 10/01/2014.
 */
public class Notification {

    @Id
    public String notificationID;
    public String subscriptionID;
    public String premiseAPIGeneratedID;
    public String providerAPIGeneratedID;
    public String notificationType;
    public String notificationCreatedDateTime;
    public String notificationURLForBillDataRetrival;
    public String notificationURLForBillImageRetrival;

}
