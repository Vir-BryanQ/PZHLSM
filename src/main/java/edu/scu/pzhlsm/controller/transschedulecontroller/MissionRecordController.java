package edu.scu.pzhlsm.controller.transschedulecontroller;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.pojo.transschedulepojo.MissionRecord;
import edu.scu.pzhlsm.service.transscheduleservice.MissionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/TransSchedule/MissionRecord")
public class MissionRecordController {
    @Autowired
    MissionRecordService missionRecordService;

    @CrossOrigin
    @GetMapping("/selectAll")
    @ResponseBody
    List<MissionRecord> selectAll(){
        return this.missionRecordService.selectAll();
    }

    @CrossOrigin
    @GetMapping("/selectOne")
    @ResponseBody
    MissionRecord selectOne(@RequestParam("missionId") int missionId){
        return this.missionRecordService.selectOne(missionId);
    }

    @CrossOrigin
    @PostMapping("/update")
    int update(@RequestBody MissionRecord missionRecord){
        return this.missionRecordService.update(missionRecord);
    }

    @CrossOrigin
    @PostMapping("/query")
    @ResponseBody
    List<MissionRecord> queryByCondition(@RequestBody JSON json){
        return this.missionRecordService.dynamicQuery(json);
    }

    @CrossOrigin
    @PostMapping("/insert")
    int insert(@RequestBody MissionRecord missionRecord){
/*        System.out.println(missionRecord);*/
        return this.missionRecordService.insert(missionRecord);
    }
}
