
package com.apmasphere.billapi.models.subscription;

import org.mongojack.Id;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


public class Subscription {

    @Id
    public String subscriptionID;
    
    public String subscriptionStatus;
    
    public String subscriptionRequestedDateTime;
    
    public String subscriptionCreateDateTime;
    
    public String subscriptionUpdatedDateTime;
    
    public String subscriptionCancelledDateTime;
    
    public String subscriptionBecomesEffectiveDateTime;
    
    public String subscriptionRequestingAgencyID;
    
    public String subscriptionForPremiseAPIGeneratedID;
    
    public String subscriptionForProviderAPIGeneratedID;
    
    public Integer subscriptionBillerReferenceNuber;
    
    public String subscriptionExpectedInvoiceFrequency;
    
    public String subscriptionFirstInvoiceDate;
    
    public List<SubscriptionBill> subscriptionBills = new ArrayList<SubscriptionBill>();

    @NotNull
    public String subscriptionCallBackURL;


}
