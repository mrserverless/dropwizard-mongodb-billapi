
package com.apmasphere.billproto.models.bill;

import java.util.HashMap;
import java.util.Map;

public class BillMetering {
    
    public Integer id;
    
    public Integer thisValue;
    
    public Integer PreviousValue;
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
