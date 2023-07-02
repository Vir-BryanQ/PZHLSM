package edu.scu.pzhlsm.pojo.carrepairmgmtpojo;

public class MaterialUsageRecord {
    private int recordId;
    private int materialId;
    private String department;
    private String user;
    private double usageQuality;
    private String usagePurpose;


    public MaterialUsageRecord() {
    }

    public MaterialUsageRecord(int recordId) {
        this.recordId = recordId;
    }

    public MaterialUsageRecord(int recordId, int materialId, String department, String user, double usageQuality, String usagePurpose) {
        this.recordId = recordId;
        this.materialId = materialId;
        this.department = department;
        this.user = user;
        this.usagePurpose = usagePurpose;
        this.usageQuality = usageQuality;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUsagePurpose() {
        return usagePurpose;
    }

    public void setUsagePurpose(String usagePurpose) {
        this.usagePurpose = usagePurpose;
    }

    public double getUsageQuality() {
        return usageQuality;
    }

    public void setUsageQuality(double usageQuality) {
        this.usageQuality = usageQuality;
    }

    @Override
    public String toString() {
        return "MaterialUsageRecord{" +
                "recordId=" + recordId +
                ", materialId=" + materialId +
                ", department='" + department + '\'' +
                ", user='" + user + '\'' +
                ", usagePurpose='" + usagePurpose + '\'' +
                ", usageQuality=" + usageQuality +
                '}';
    }
}
