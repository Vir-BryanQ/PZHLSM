package edu.scu.pzhlsm.pojo.basicinfomgmtpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    private int vehicleId;
    private String vehicleNumber;
    private String typeId;
    private String latestUse;
    private int status;
    private String supplier;
    private String plate;
    private String purpose;
    private int automobileId;

    public Vehicle(String vehicleNumber, String typeId, String latestUse, int status, String supplier, String plate, String purpose, int automobileId) {
        this.vehicleNumber = vehicleNumber;
        this.typeId = typeId;
        this.latestUse = latestUse;
        this.status = status;
        this.supplier = supplier;
        this.plate = plate;
        this.purpose = purpose;
        this.automobileId = automobileId;
    }
}
