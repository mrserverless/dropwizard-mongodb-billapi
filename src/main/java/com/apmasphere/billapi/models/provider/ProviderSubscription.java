
package com.apmasphere.billapi.models.provider;

import org.mongojack.Id;

public class ProviderSubscription {

    //TODO note the JSON sample data fields are inconsistent with original spec

    @Id
    public String id;
    
    public String status;

}
