package edu.scu.pzhlsm.pojo.datastatisticanalysispojo;

import java.util.List;

public class GetDate {
    private List<String> dates;

    public GetDate() {
    }

    public GetDate(List<String> dates) {
        this.dates = dates;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}
