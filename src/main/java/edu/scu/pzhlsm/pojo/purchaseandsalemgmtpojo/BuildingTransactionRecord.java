package edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo;

public class BuildingTransactionRecord {
    private int recordId;
    private int buildingId;
    private String transactionType;
    private String tenantBuyerName;
    private String transactionDate;
    private double transactionPrice;
    private int leaseTerm;


    public BuildingTransactionRecord() {
    }

    public BuildingTransactionRecord(int recordId) {
        this.recordId = recordId;
    }

    public BuildingTransactionRecord(int buildingId, String transactionType, String tenantBuyerName, String transactionDate, double transactionPrice, int leaseTerm) {
        this.buildingId = buildingId;
        this.transactionType = transactionType;
        this.tenantBuyerName = tenantBuyerName;
        this.transactionDate = transactionDate;
        this.transactionPrice = transactionPrice;
        this.leaseTerm = leaseTerm;
    }

    public BuildingTransactionRecord(int recordId, int buildingId, String transactionType, String tenantBuyerName, String transactionDate, double transactionPrice, int leaseTerm) {
        this.recordId = recordId;
        this.buildingId = buildingId;
        this.transactionType = transactionType;
        this.tenantBuyerName = tenantBuyerName;
        this.transactionDate = transactionDate;
        this.transactionPrice = transactionPrice;
        this.leaseTerm = leaseTerm;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTenantBuyerName() {
        return tenantBuyerName;
    }

    public void setTenantBuyerName(String tenantBuyerName) {
        this.tenantBuyerName = tenantBuyerName;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(double transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    public int getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    @Override
    public String toString() {
        return "BuildingTransactionRecord{" +
                "recordId=" + recordId +
                ", buildingId=" + buildingId +
                ", transactionType='" + transactionType + '\'' +
                ", tenantBuyerName='" + tenantBuyerName + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", transactionPrice=" + transactionPrice +
                ", leaseTerm=" + leaseTerm +
                '}';
    }
}
