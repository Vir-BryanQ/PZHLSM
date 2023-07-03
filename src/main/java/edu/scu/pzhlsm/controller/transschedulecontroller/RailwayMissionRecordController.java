package edu.scu.pzhlsm.controller.transschedulecontroller;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.pojo.transschedulepojo.RailwayMissionRecord;
import edu.scu.pzhlsm.service.transscheduleservice.RailwayMissionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/TransSchedule/RailwayMissionRecord")
public class RailwayMissionRecordController {
    @Autowired
    private RailwayMissionRecordService railwayMissionRecordService;

    @CrossOrigin
    @GetMapping("/selectAll")
    @ResponseBody
    List<RailwayMissionRecord> selectAll(){
        return this.railwayMissionRecordService.selectAll();
    }

    @CrossOrigin
    @GetMapping("/selectOne")
    @ResponseBody
    RailwayMissionRecord selectOne(@RequestParam("missionId")int missionId){
        return this.railwayMissionRecordService.selectOne(missionId);
    }

    @CrossOrigin
    @PostMapping("/update")
    int update(@RequestBody RailwayMissionRecord railwayMissionRecord){
        return this.railwayMissionRecordService.update(railwayMissionRecord);
    }

    @CrossOrigin
    @PostMapping("/query")
    @ResponseBody
    List<RailwayMissionRecord> queryByCondition(@RequestBody JSON json){
        return this.railwayMissionRecordService.dynamicQuery(json);
    }

    @CrossOrigin
    @PostMapping("/insert")
    int insert(@RequestBody RailwayMissionRecord railwayMissionRecord){
        return this.railwayMissionRecordService.insert(railwayMissionRecord);
    }
}
