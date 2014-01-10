
package com.apmasphere.billproto.models.subscription;

import org.mongojack.Id;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.persistence.Id;


public class Subscription {

    @Id
    public String subscriptionID;
    
    private String subscriptionStatus;
    
    private String subscriptionRequestedDateTime;
    
    private String subscriptionCreateDateTime;
    
    private String subscriptionUpdatedDateTime;
    
    private String subscriptionCancelledDateTime;
    
    private String subscriptionBecomesEffectiveDateTime;
    
    private String subscriptionRequestingAgencyID;
    
    private String subscriptionForPremiseAPIGeneratedID;
    
    private String subscriptionForProviderAPIGeneratedID;
    
    private Integer subscriptionBillerReferenceNuber;
    
    private String subscriptionExpectedInvoiceFrequency;
    
    private String subscriptionFirstInvoiceDate;
    
    private List<SubscriptionBill> subscriptionBills = new ArrayList<SubscriptionBill>();
    
    private String subscriptionCallBackURL;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   /* @Id
    public String getSubscriptionID() {
        return subscriptionID;
    }

    @Id
    public void setSubscriptionID(String subscriptionID) {
        this.subscriptionID = subscriptionID;
    }
*/
    
    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }

    
    public void setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    
    public String getSubscriptionRequestedDateTime() {
        return subscriptionRequestedDateTime;
    }

    
    public void setSubscriptionRequestedDateTime(String subscriptionRequestedDateTime) {
        this.subscriptionRequestedDateTime = subscriptionRequestedDateTime;
    }

    
    public String getSubscriptionCreateDateTime() {
        return subscriptionCreateDateTime;
    }

    
    public void setSubscriptionCreateDateTime(String subscriptionCreateDateTime) {
        this.subscriptionCreateDateTime = subscriptionCreateDateTime;
    }

    
    public String getSubscriptionUpdatedDateTime() {
        return subscriptionUpdatedDateTime;
    }

    
    public void setSubscriptionUpdatedDateTime(String subscriptionUpdatedDateTime) {
        this.subscriptionUpdatedDateTime = subscriptionUpdatedDateTime;
    }

    
    public String getSubscriptionCancelledDateTime() {
        return subscriptionCancelledDateTime;
    }

    
    public void setSubscriptionCancelledDateTime(String subscriptionCancelledDateTime) {
        this.subscriptionCancelledDateTime = subscriptionCancelledDateTime;
    }

    
    public String getSubscriptionBecomesEffectiveDateTime() {
        return subscriptionBecomesEffectiveDateTime;
    }

    
    public void setSubscriptionBecomesEffectiveDateTime(String subscriptionBecomesEffectiveDateTime) {
        this.subscriptionBecomesEffectiveDateTime = subscriptionBecomesEffectiveDateTime;
    }

    
    public String getSubscriptionRequestingAgencyID() {
        return subscriptionRequestingAgencyID;
    }

    
    public void setSubscriptionRequestingAgencyID(String subscriptionRequestingAgencyID) {
        this.subscriptionRequestingAgencyID = subscriptionRequestingAgencyID;
    }

    
    public String getSubscriptionForPremiseAPIGeneratedID() {
        return subscriptionForPremiseAPIGeneratedID;
    }

    
    public void setSubscriptionForPremiseAPIGeneratedID(String subscriptionForPremiseAPIGeneratedID) {
        this.subscriptionForPremiseAPIGeneratedID = subscriptionForPremiseAPIGeneratedID;
    }

    
    public String getSubscriptionForProviderAPIGeneratedID() {
        return subscriptionForProviderAPIGeneratedID;
    }

    
    public void setSubscriptionForProviderAPIGeneratedID(String subscriptionForProviderAPIGeneratedID) {
        this.subscriptionForProviderAPIGeneratedID = subscriptionForProviderAPIGeneratedID;
    }

    
    public Integer getSubscriptionBillerReferenceNuber() {
        return subscriptionBillerReferenceNuber;
    }

    
    public void setSubscriptionBillerReferenceNuber(Integer subscriptionBillerReferenceNuber) {
        this.subscriptionBillerReferenceNuber = subscriptionBillerReferenceNuber;
    }

    
    public String getSubscriptionExpectedInvoiceFrequency() {
        return subscriptionExpectedInvoiceFrequency;
    }

    
    public void setSubscriptionExpectedInvoiceFrequency(String subscriptionExpectedInvoiceFrequency) {
        this.subscriptionExpectedInvoiceFrequency = subscriptionExpectedInvoiceFrequency;
    }

    
    public String getSubscriptionFirstInvoiceDate() {
        return subscriptionFirstInvoiceDate;
    }

    
    public void setSubscriptionFirstInvoiceDate(String subscriptionFirstInvoiceDate) {
        this.subscriptionFirstInvoiceDate = subscriptionFirstInvoiceDate;
    }

    
    public List<SubscriptionBill> getSubscriptionBills() {
        return subscriptionBills;
    }

    
    public void setSubscriptionBills(List<SubscriptionBill> subscriptionBills) {
        this.subscriptionBills = subscriptionBills;
    }

    
    public String getSubscriptionCallBackURL() {
        return subscriptionCallBackURL;
    }

    
    public void setSubscriptionCallBackURL(String subscriptionCallBackURL) {
        this.subscriptionCallBackURL = subscriptionCallBackURL;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
