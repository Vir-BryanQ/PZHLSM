package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSONObject;
import edu.scu.pzhlsm.pojo.transschedulepojo.CarRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class CarRecordServiceTest {
    @Autowired
    CarRecordService carRecordService;

    //更新测试
    @Test
    void carRecordTest(){
        CarRecord carRecord = new CarRecord();
        carRecord.setMissionId(10000001);
        carRecord.setCarId("190811");
        carRecord.setCarLicence("川A-11111");
        carRecord.setState(1);
        carRecord.setMissionBeginTime("2023-07-03");
        carRecord.setCarType(2);
        System.out.println(carRecord);
        int ret = carRecordService.update(carRecord);
        System.out.println(ret);
    }

    //查询测试
    @Test
    void query(){
        System.out.println(carRecordService.selectOne(10000001));
        List<CarRecord> list = carRecordService.selectAll();
        for (CarRecord carRecord : list) System.out.println(carRecord);
    }

    //动态查询测试
    @Test
    void dynamicQuery(){
        Map<String, Object> map = new HashMap<>();
        map.put("carType", 2);
        map.put("carLicence", "川A");
        //map.put("missionBeginTime", "2023-07-01");
        JSONObject json = new JSONObject();
        json.putAll(map);
        //System.out.println(json);
        System.out.println(carRecordService.dynamicQuery(json));
    }

/*    //插入测试
    @Test
    void insert(){
        CarRecord carRecord = new CarRecord();
        carRecord.setMissionId(999);
        carRecord.setCarId("220101");
        carRecord.setCarLicence("川C-22222");
        carRecord.setState(3);
        carRecord.setMissionBeginTime("2023-07-02");
        carRecord.setCarType(1);
        carRecordService.insert(carRecord);
    }*/
}
