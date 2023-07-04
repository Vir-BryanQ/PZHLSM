package edu.scu.pzhlsm;

import edu.scu.pzhlsm.controller.datastatisticanalysiscontroller.OutputValueProfitController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class PzhlsmApplicationTests {

    @Autowired
    OutputValueProfitController outputValueProfitController;

    @Test
    void contextLoads() {
        List<String> dates = new ArrayList<>();
        dates.add("2022-01");
        dates.add("2022-02");
        dates = outputValueProfitController.convertDate(dates);
        for (String date : dates) {
            System.out.println(date);
        }
    }

}
