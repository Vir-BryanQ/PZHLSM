package edu.scu.pzhlsm.service.datastatisticanalysisservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class OutputValueProfitServiceTest {
    @Autowired
    private OutputValueProfitService outputValueProfitService;

    @Test
    public void getOutputValueProfitByDatesTest() {
        List<String> dates = new ArrayList<>();
        dates.add("2022-06");
        dates.add("2022-07");
        dates.add("2022-08");
        dates.add("2022-09");
        dates.add("2022-10");
        dates.add("2022-11");
        dates.add("2022-12");
        dates.add("2023-01");
        List<Double> profit = outputValueProfitService.getOutputValueProfitByDates(dates);
        for (Double p : profit) {
            System.out.println(p);
        }
    }
}
