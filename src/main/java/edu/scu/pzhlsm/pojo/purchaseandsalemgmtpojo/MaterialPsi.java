package edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialPsi {
    private int materialId;
    private String materialName;
    private int materialQuantity;
    private int materialStatus;
    private String createTime;
    private float materialPrice;
    private String remark;

    public MaterialPsi(String materialName, int materialQuantity, int materialStatus, String createTime, float materialPrice, String remark) {
        this.materialName = materialName;
        this.materialQuantity = materialQuantity;
        this.materialStatus = materialStatus;
        this.createTime = createTime;
        this.materialPrice = materialPrice;
        this.remark = remark;
    }
}
