package edu.scu.pzhlsm.pojo.transschedulepojo;

import java.io.Serializable;

public class CarRecord implements Serializable {
    private int missionId;
    private String carId;
    private int carType;
    private String carLicence;
    private String missionBeginTime;
    private int state;

    public CarRecord() {
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public String getCarLicence() {
        return carLicence;
    }

    public void setCarLicence(String carLicence) {
        this.carLicence = carLicence;
    }

    public String getMissionBeginTime() {
        return missionBeginTime;
    }

    public void setMissionBeginTime(String missionBeginTime) {
        this.missionBeginTime = missionBeginTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CarRecord{" +
                "missionId=" + missionId +
                ", carId='" + carId + '\'' +
                ", carType=" + carType +
                ", carLicence='" + carLicence + '\'' +
                ", missionBeginTime='" + missionBeginTime + '\'' +
                ", state=" + state +
                '}';
    }
}
