package edu.scu.pzhlsm.pojo.carrepairmgmtpojo;

public class CarRepairRecord {
    private int recordId;
    private int carId;
    private String repairDate;
    private String repairType;
    private String repairDescription;
    private double repairCost;

    public CarRepairRecord() {
    }

    public CarRepairRecord(int recordId) {
        this.recordId = recordId;
    }

    public CarRepairRecord(int recordId, int carId, String repairDate, String repairType, String repairDescription, double repairCost) {
        this.recordId = recordId;
        this.carId = carId;
        this.repairDate = repairDate;
        this.repairType = repairType;
        this.repairDescription = repairDescription;
        this.repairCost = repairCost;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(String repairDate) {
        this.repairDate = repairDate;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    public double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

    @Override
    public String toString() {
        return "CarRepairRecord{" +
                "recordId=" + recordId +
                ", carId=" + carId +
                ", repairDate='" + repairDate + '\'' +
                ", repairType='" + repairType + '\'' +
                ", repairDescription='" + repairDescription + '\'' +
                ", repairCost=" + repairCost +
                '}';
    }
}
