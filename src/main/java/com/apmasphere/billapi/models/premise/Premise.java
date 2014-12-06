
package com.apmasphere.billapi.models.premise;

import org.mongojack.Id;

import java.util.ArrayList;
import java.util.List;

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

   
}
