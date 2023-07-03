package edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehiclePsi {
    private int vehicleId;
    private String vehicleName;
    private String vehicleModel;
    private int vehicleQuantity;
    private int vehicleStatus;
    private String createTime;
    private float vehiclePrice;
    private String remark;

    public VehiclePsi(String vehicleName, String vehicleModel, int vehicleQuantity, int vehicleStatus, String createTime, float vehiclePrice, String remark) {
        this.vehicleName = vehicleName;
        this.vehicleModel = vehicleModel;
        this.vehicleQuantity = vehicleQuantity;
        this.vehicleStatus = vehicleStatus;
        this.createTime = createTime;
        this.vehiclePrice = vehiclePrice;
        this.remark = remark;
    }
}