package edu.scu.pzhlsm.pojo.transschedulepojo;

import java.io.Serializable;

public class BusinessRecord implements Serializable {
    private int missionId;
    private String companyName;
    private int missionPrice;
    private int state;

    public BusinessRecord() {
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getmissionPrice() {
        return missionPrice;
    }

    public void setmissionPrice(int missionPrice) {
        this.missionPrice = missionPrice;
    }

    public int getstate() {
        return state;
    }

    public void setstate(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BusinessRecord{" +
                "missionId=" + missionId +
                ", companyName='" + companyName + '\'' +
                ", missionPrice=" + missionPrice +
                ", state=" + state +
                '}';
    }
}
