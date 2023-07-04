package edu.scu.pzhlsm.controller.transschedulecontroller;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.pojo.transschedulepojo.BusinessRecord;
import edu.scu.pzhlsm.service.transscheduleservice.BusinessRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/TransSchedule/BusinessRecord")
public class BusinessRecordController {
    @Autowired
    private BusinessRecordService businessRecordService;

    @CrossOrigin
    @GetMapping("/selectAll")
    @ResponseBody
    List<BusinessRecord> selectAll(){
        return this.businessRecordService.selectAll();
    }

    @CrossOrigin
    @GetMapping("/selectOne")
    @ResponseBody
    BusinessRecord selectOne(@RequestParam("missionId")int missionId){
        return this.businessRecordService.selectOne(missionId);
    }

    @CrossOrigin
    @PostMapping("/update")
    int update(@RequestBody BusinessRecord businessRecord){
        return this.businessRecordService.update(businessRecord);
    }

    @CrossOrigin
    @PostMapping("/insert")
    int insert(@RequestBody BusinessRecord businessRecord){
        return businessRecordService.insert(businessRecord);
    }

    @CrossOrigin
    @PostMapping("/query")
    @ResponseBody
    List<BusinessRecord> queryByCondition(@RequestBody JSON json){
        return this.businessRecordService.dynamicQuery(json);
    }
}
