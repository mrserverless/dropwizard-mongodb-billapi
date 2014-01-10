
package com.apmasphere.billproto.models.provider;

import org.mongojack.Id;

import java.util.HashMap;
import java.util.Map;

public class ProviderSubscription {

    //TODO note the JSON sample data fields are inconsistent with original spec

    @Id
    public String id;
    
    public String status;
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
