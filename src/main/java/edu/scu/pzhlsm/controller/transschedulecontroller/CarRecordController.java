package edu.scu.pzhlsm.controller.transschedulecontroller;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.pojo.transschedulepojo.CarRecord;
import edu.scu.pzhlsm.service.transscheduleservice.CarRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/TransSchedule/CarRecord")
public class CarRecordController {
    @Autowired
    private CarRecordService carRecordService;

    @CrossOrigin
    @GetMapping("/selectAll")
    @ResponseBody
    List<CarRecord> selectAll(){
        return this.carRecordService.selectAll();
    }

    @CrossOrigin
    @GetMapping("/selectOne")
    @ResponseBody
    CarRecord selectOne(@RequestParam("missionId")int missionId){
        return this.carRecordService.selectOne(missionId);
    }

    @CrossOrigin
    @PostMapping("/update")
    int update(@RequestBody CarRecord carRecord){
        return this.carRecordService.update(carRecord);
    }

/*    @CrossOrigin
    @PostMapping("/insert")
    int insert(@RequestBody CarRecord carRecord){
        return carRecordService.insert(carRecord);
    }*/

    @CrossOrigin
    @PostMapping("/query")
    @ResponseBody
    List<CarRecord> queryByCondition(@RequestBody Map<String, Object> map){
        return this.carRecordService.dynamicQuery(map);
    }
}
