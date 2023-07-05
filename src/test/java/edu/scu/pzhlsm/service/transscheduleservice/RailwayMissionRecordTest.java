package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSONObject;
import edu.scu.pzhlsm.pojo.transschedulepojo.RailwayMissionRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class RailwayMissionRecordTest {
    @Autowired
    RailwayMissionRecordService railwayMissionRecordService;

    //插入测试
    @Test
    void insert(){
        RailwayMissionRecord record = new RailwayMissionRecord();
        record.setCompanyName("攀枝花");
        record.setMissionOrigin("四川成都");
        record.setMissionPrice(890000);
        record.setTrainId("Z-790");
        record.setMissionId(100001);
        railwayMissionRecordService.insert(record);
    }
    //更新测试
    @Test
    void railwayMissionRecordTest(){
        RailwayMissionRecord record = new RailwayMissionRecord();
        record.setCompanyName("pzh");
        record.setMissionOrigin("SCCD");
        record.setMissionPrice(100000);
        record.setTrainId("H-610");
        record.setMissionId(100001);
        railwayMissionRecordService.update(record);
        System.out.println(record);
    }

    //查询测试
    @Test
    void query(){
        System.out.println(railwayMissionRecordService.selectOne(100001));
    }

    //动态查询测试
    @Test
    void dynamicQuery(){
        Map<String, Object> map = new HashMap<>();
        map.put("missionOrigin", "C");
        map.put("trainId", "E");
        map.put("state", 0);
        JSONObject json = new JSONObject();
        json.putAll(map);
        System.out.println(railwayMissionRecordService.dynamicQuery(json));
    }
}
