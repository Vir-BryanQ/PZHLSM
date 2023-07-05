package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSONObject;
import edu.scu.pzhlsm.pojo.transschedulepojo.BusinessRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class BusinessRecordServiceTest {
    @Autowired
    BusinessRecordService businessRecordService;

    //单条查询测试
    @Test
    void getRecordByIdTest()
    {
        //封装查询参数
        int missionId = 100001;
        //调用
        BusinessRecord businessRecord = businessRecordService.selectOne(missionId);
        System.out.println(businessRecord);
    }

    //动态查询测试
    @Test
    void dynamicQuery()
    {
        //封装查询参数
        Map<String, Object> map = new HashMap<>();
        map.put("state", 0);
        map.put("companyName", "nv");
        JSONObject json = new JSONObject();
        json.putAll(map);
        //调用
        List<BusinessRecord> businessRecords = businessRecordService.dynamicQuery(json);
        System.out.println(businessRecords);
    }

    //动态update测试
    @Test
    void dynamicUpdate()
    {
        //封装参数
        BusinessRecord businessRecord = new BusinessRecord();
        businessRecord.setMissionId(10000004);
        businessRecord.setstate(4);
        businessRecord.setCompanyName("华迪");
        businessRecord.setmissionPrice(10000);
        System.out.println(businessRecord);
        //调用
        int ret = businessRecordService.update(businessRecord);
        System.out.println(ret);
    }

/*    //插入测试
    @Test
    void insert(){
        //封装参数
        BusinessRecord record = new BusinessRecord();
        record.setMissionId(1);
        record.setCompanyName("nvdia");
        record.setmissionPrice(100000);
        //调用service
        System.out.println(businessRecordService.insert(record));
    }*/
}
