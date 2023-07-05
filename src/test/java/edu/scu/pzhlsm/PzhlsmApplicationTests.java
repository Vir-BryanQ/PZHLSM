package edu.scu.pzhlsm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import edu.scu.pzhlsm.dao.transscheduledao.MissionRecordDAO;
import edu.scu.pzhlsm.service.datastatisticanalysisservice.ExportBusinessDistributedStatsService;
import edu.scu.pzhlsm.service.transscheduleservice.MissionRecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class PzhlsmApplicationTests {
    @Autowired
    ExportBusinessDistributedStatsService EBDSService;
    @Test
    void contextLoads() {
    }

    //日期转换测试
    @Test
    void convertDate(){
        Map<String, Object> inMap = new HashMap<>();
        List<String> inDate = new ArrayList<>();
        inDate.add("2019-07");
        inDate.add("2022-07");
        inMap.put("dates", inDate);
        System.out.println(JSON.toJSONString(inMap));
        LocalDate beginTime = LocalDate.parse(inDate.get(0) + "-01");
        LocalDate endTime = LocalDate.parse(inDate.get(1) + "-01");
        int y1 = beginTime.getYear();
        int m1 = beginTime.getMonthValue();
        int y2 = endTime.getYear();
        int m2 = endTime.getMonthValue();
        int sum = 12 * (y2 - y1) + m2 - m1 + 1;
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < sum; i++){
            if(m1 < 10) ret.add(y1 + "-0" + m1);
            else ret.add(y1 + "-" + m1);
            m1++;
            if(m1 > 12) {
                m1 -= 12;
                y1++;
            }
        }
        System.out.println(ret);
    }

    @Test
    void chartTest(){
        System.out.println(EBDSService.export("2023"));
        List<Integer> a = EBDSService.export("2023");
        System.out.println(a);
        List<Integer> b = new ArrayList<>(EBDSService.export("2023"));
        System.out.println(b);
    }
}
