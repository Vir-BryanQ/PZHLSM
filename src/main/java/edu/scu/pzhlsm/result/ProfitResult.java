package edu.scu.pzhlsm.result;

import java.util.Arrays;
import java.util.List;

public class ProfitResult extends Result{
    private List<Double> profit;
    private List<String> dates;

    public ProfitResult(int status, List<Double> profit, List<String> dates) {
        super(status);
        this.profit = profit;
        this.dates = dates;
    }

    public List<Double> getProfit() {
        return profit;
    }

    public void setProfit(List<Double> profit) {
        this.profit = profit;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}
