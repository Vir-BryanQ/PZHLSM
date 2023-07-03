package edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommodityPsi {
    private int commodityId;
    private String commodityName;
    private int commodityQuantity;
    private int commodityStatus;
    private String createTime;
    private float commodityPrice;
    private String remark;

    public CommodityPsi(String commodityName, int commodityQuantity, int commodityStatus, String createTime, float commodityPrice, String remark) {
        this.commodityName = commodityName;
        this.commodityQuantity = commodityQuantity;
        this.commodityStatus = commodityStatus;
        this.createTime = createTime;
        this.commodityPrice = commodityPrice;
        this.remark = remark;
    }
}
