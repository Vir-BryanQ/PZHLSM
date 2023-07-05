package edu.scu.pzhlsm.service.datastatisticanalysisservice;

import edu.scu.pzhlsm.pojo.transschedulepojo.MissionRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class LinearDataAnalysisServiceTest {

    @Autowired
    LinearDataAnalysisService linearDataAnalysisService;

    @Test
    public void missionTest(){
        String[] dates = {"2022-03-12", "2023-06-12"};
        System.out.println("12".compareTo("07"));
        System.out.println(Integer.parseInt("06"));
    }
}
