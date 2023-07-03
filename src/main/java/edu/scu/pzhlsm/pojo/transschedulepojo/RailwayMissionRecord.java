package edu.scu.pzhlsm.pojo.transschedulepojo;

import java.io.Serializable;

public class RailwayMissionRecord implements Serializable {
    private int missionId;
    private String companyName;
    private int missionPrice;
    private String missionOrigin;
    private String missionDestination;
    private String trainId;
    private String missionBeginTime;
    private String missionFinishTime;
    private int state;

    public RailwayMissionRecord() {
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

    public int getMissionPrice() {
        return missionPrice;
    }

    public void setMissionPrice(int missionPrice) {
        this.missionPrice = missionPrice;
    }

    public String getMissionOrigin() {
        return missionOrigin;
    }

    public void setMissionOrigin(String missionOrigin) {
        this.missionOrigin = missionOrigin;
    }

    public String getMissionDestination() {
        return missionDestination;
    }

    public void setMissionDestination(String missionDestination) {
        this.missionDestination = missionDestination;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getMissionBeginTime() {
        return missionBeginTime;
    }

    public void setMissionBeginTime(String missionBeginTime) {
        this.missionBeginTime = missionBeginTime;
    }

    public String getMissionFinishTime() {
        return missionFinishTime;
    }

    public void setMissionFinishTime(String missionFinishTime) {
        this.missionFinishTime = missionFinishTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "RailwayMissionRecord{" +
                "missionId=" + missionId +
                ", companyName='" + companyName + '\'' +
                ", missionPrice=" + missionPrice +
                ", missionOrigin='" + missionOrigin + '\'' +
                ", missionDestination='" + missionDestination + '\'' +
                ", trainId='" + trainId + '\'' +
                ", missionBeginTime='" + missionBeginTime + '\'' +
                ", missionFinishTime='" + missionFinishTime + '\'' +
                ", state=" + state +
                '}';
    }
}
