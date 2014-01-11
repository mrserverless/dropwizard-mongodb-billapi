
package com.apmasphere.billproto.models.bill;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.mongojack.Id;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bill {

    @Id
    public String billID;
    
    public String billStatus;
    
    public Double billPresentmentChargeAmount;
    
    public String billProviderAPIGeneratedID;
    
    public String billResourceCreatedDateTime;
    
    public String billProviderABN;
    
    public Integer billAccountNumberForInqueries;
    
    public Integer billAccountNumberForPayment;
    
    public String billDescription;
    
    public String billServiceDateRangeStart;
    
    public String billServiceDateRangeEnd;
    
    public List<BillMetering> billMetering = new ArrayList<BillMetering>();
    
    public String billIssueDate;
    
    public String billDueDate;
    
    public Integer billTotalGST;
    
    public Double billTotalAmount;
    
    public String billDiscountDate;
    
    public Integer billDiscountAmount;
    
    public List<BillInstallmants> billInstallments = new ArrayList<BillInstallmants>();
    
    public Integer billBpayCode;
    
    public Integer billBpayRef;
    
    public Integer billPostPayCode;
    
    public Integer billPostPayRef;
    
    public String billImageAvailableDateTime;
    
    public List<BillImage> billImage = new ArrayList<BillImage>();

}
