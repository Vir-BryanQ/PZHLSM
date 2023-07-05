package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSONObject;
import edu.scu.pzhlsm.pojo.transschedulepojo.MissionRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MissionRecordTest {
    @Autowired
    MissionRecordService missionRecordService;

    //插入数据测试
    @Test
    void missionRecordInsertTest(){
        //插入对象
        MissionRecord missionRecord = new MissionRecord();
        missionRecord.setstate(2);
        missionRecord.setMissionCreateTime("2023-06-11");
        missionRecord.setMissionFinishTime("2002-01-01");
        missionRecord.setMissionOrigin("成都市郫都区圆通分公司");
        missionRecord.setMissionDestination("成都市郫都区京东分公司");
        missionRecordService.insert(missionRecord);
        int ret = missionRecord.getMissionId();
        System.out.println(ret);
    }

    //更新测试
    @Test
    void update(){
        MissionRecord missionRecord = new MissionRecord();
        missionRecord.setMissionId(10000003);
        missionRecord.setstate(2);
        missionRecord.setMissionCreateTime("2023-06-06");
        missionRecord.setMissionFinishTime("2002-01-01");
        missionRecord.setMissionOrigin("成都市郫都区圆通分公司");
        missionRecord.setMissionDestination("成都市郫都区京东分公司");
        missionRecordService.update(missionRecord);
    }

    //查询测试
    @Test
    void query(){
        System.out.println(missionRecordService.selectOne(10000001));
        List<MissionRecord> list = missionRecordService.selectAll();
        for (MissionRecord missionRecord : list) System.out.println(missionRecord);
    }

    //动态查询测试
    @Test
    void dynamicQuery(){
        Map<String, Object> map = new HashMap<>();
        map.put("createTime", "2023-06");
        map.put("state", 1);
        map.put("missionOrigin", "京东");
        JSONObject json = new JSONObject();
        json.putAll(map);
        System.out.println(missionRecordService.dynamicQuery(json));
    }
}
