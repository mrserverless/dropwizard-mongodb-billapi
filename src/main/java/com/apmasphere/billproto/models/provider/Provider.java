
package com.apmasphere.billproto.models.provider;

import org.mongojack.Id;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Provider {

    @Id
    public String providerAPIGeneratedID;
    
    public String providerDisambiguationReference;
    
    public String providerStatus;
    
    public String providerName;
    
    public String providerServiceType;
    
    public String providerDefaultABN;
    
    public String providerMailingPoint;
    
    public String providerSupportsBPay;
    
    public Integer providerDefaultBPayCode;
    
    public String providerSupportPhonePay;
    
    public String providerPhonePayNumber;
    
    public String provideSupportPostPay;
    
    public String providerSupportDirectDeposit;
    
    public String providerDirectDepositBank;
    
    public String provideDirectDepositBSB;
    
    public String provideDirectDepositAccount;
    
    public String providerSupportPhoneInqury;
    
    public String providerSupportPhoneNumber;
    
    public String providerSupportOnline;
    
    public String providerOnlineURL;
    
    public String providerCreated;
    
    public String providerUpdated;
    
    public String providerRequires;
    
    public List<ProviderSubscription> providerSubscriptions = new ArrayList<ProviderSubscription>();
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
