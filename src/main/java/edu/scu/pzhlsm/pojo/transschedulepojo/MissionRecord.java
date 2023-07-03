package edu.scu.pzhlsm.pojo.transschedulepojo;


import java.io.Serializable;

public class MissionRecord implements Serializable {
    private int missionId;
    private String missionCreateTime;
    private String missionFinishTime;
    private String missionOrigin;
    private String missionDestination;
    private int state;

    public MissionRecord() {
    }

    public int getMissionId() {
        return missionId;
    }

    public String getMissionCreateTime() {
        return missionCreateTime;
    }

    public String getMissionFinishTime() {
        return missionFinishTime;
    }

    public String getMissionOrigin() {
        return missionOrigin;
    }

    public String getMissionDestination() {
        return missionDestination;
    }

    public int getstate() {
        return state;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public void setMissionCreateTime(String missionCreateTime) {
        this.missionCreateTime = missionCreateTime;
    }

    public void setMissionFinishTime(String missionFinishTime) {
        this.missionFinishTime = missionFinishTime;
    }

    public void setMissionOrigin(String missionOrigin) {
        this.missionOrigin = missionOrigin;
    }

    public void setMissionDestination(String missionDestination) {
        this.missionDestination = missionDestination;
    }

    public void setstate(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "MissionRecord{" +
                "missionId=" + missionId +
                ", missionCreateTime=" + missionCreateTime +
                ", missionFinishTime=" + missionFinishTime +
                ", missionOrigin='" + missionOrigin + '\'' +
                ", missionDestination='" + missionDestination + '\'' +
                ", state=" + state +
                '}';
    }
}
