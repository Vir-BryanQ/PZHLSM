package edu.scu.pzhlsm.pojo.carrepairmgmtpojo;

public class RepairWorkerMaintenanceRecord {
    private int recordId;
    private int repairWorkerId;
    private int carId;
    private String maintenanceDate;
    private String maintenanceDescription;
    private double maintenanceCost;

    public RepairWorkerMaintenanceRecord() {
    }

    public RepairWorkerMaintenanceRecord(int recordId) {
        this.recordId = recordId;
    }

    public RepairWorkerMaintenanceRecord(int recordId, int repairWorkerId, int carId, String maintenanceDate, String maintenanceDescription, double maintenanceCost) {
        this.recordId = recordId;
        this.repairWorkerId = repairWorkerId;
        this.carId = carId;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceDescription = maintenanceDescription;
        this.maintenanceCost = maintenanceCost;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getRepairWorkerId() {
        return repairWorkerId;
    }

    public void setRepairWorkerId(int repairWorkerId) {
        this.repairWorkerId = repairWorkerId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(String maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getMaintenanceDescription() {
        return maintenanceDescription;
    }

    public void setMaintenanceDescription(String maintenanceDescription) {
        this.maintenanceDescription = maintenanceDescription;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    @Override
    public String toString() {
        return "RepairWorkerMaintenanceRecord{" +
                "recordId=" + recordId +
                ", repairWorkerId=" + repairWorkerId +
                ", carId=" + carId +
                ", maintenanceDate='" + maintenanceDate + '\'' +
                ", maintenanceDescription='" + maintenanceDescription + '\'' +
                ", maintenanceCost=" + maintenanceCost +
                '}';
    }
}
