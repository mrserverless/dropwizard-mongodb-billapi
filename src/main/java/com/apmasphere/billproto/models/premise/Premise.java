
package com.apmasphere.billproto.models.premise;

import org.mongojack.Id;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Premise {

    @Id
    public String premiseAPIGeneratedID;
    
    public String premiseDisambiguationReference;
    
    public String premiseAddressLine;
    
    public String premiseSuburb;
    
    public Integer premisePostCode;
    
    public String premiseState;
    
    public Integer premiseDPID;
    
    public String premiseCreatedDateTime;
    
    public String premiseUpdatedDateTime;
    
    public String premiseCreatedAgent;
    
    public String premiseCurrentAgency;
    
    public String premisePreviousAgency;
    
    public List<PremiseSubscription> premiseSubscriptions = new ArrayList<PremiseSubscription>();
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

   
}
