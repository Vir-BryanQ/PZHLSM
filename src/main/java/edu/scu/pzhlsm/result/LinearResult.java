package edu.scu.pzhlsm.result;

import java.util.HashMap;
import java.util.List;


public class LinearResult extends Result{

    private List<Integer> missionFinished;
    private List<Integer> carRepaired;
    private List<String> dates;

    public LinearResult(int status, List<Integer> missionFinished, List<Integer> carRepaired, List<String> dates) {
        super(status);
        this.missionFinished = missionFinished;
        this.carRepaired = carRepaired;
        this.dates = dates;
    }

    public List<Integer> getMissionFinished() {
        return missionFinished;
    }

    public void setMissionFinished(List<Integer> missionFinished) {
        this.missionFinished = missionFinished;
    }

    public List<Integer> getCarRepaired() {
        return carRepaired;
    }

    public void setCarRepaired(List<Integer> carRepaired) {
        this.carRepaired = carRepaired;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}
