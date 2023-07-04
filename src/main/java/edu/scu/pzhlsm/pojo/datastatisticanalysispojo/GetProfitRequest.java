package edu.scu.pzhlsm.pojo.datastatisticanalysispojo;

import java.util.List;

public class GetProfitRequest {
    List<String> dates;

    public GetProfitRequest() {
    }

    public GetProfitRequest(List<String> dates) {
        this.dates = dates;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}
