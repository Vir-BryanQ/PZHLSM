package edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfficeConsumable {

    private int officeConsumablesId;
    private String consumableName;
    private int purchaseQuantity;
    private String createTime;
    private float perPrice;
    private String remark;

    public OfficeConsumable(String consumableName, int purchaseQuantity, String creatTime, float perPrice, String remark) {
        this.consumableName = consumableName;
        this.purchaseQuantity = purchaseQuantity;
        this.createTime = creatTime;
        this.perPrice = perPrice;
        this.remark = remark;
    }
}
