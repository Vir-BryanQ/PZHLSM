package edu.scu.pzhlsm.controller.carrepairmgmtcontroller;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.MaterialUsageRecord;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.carrepairmgmtservice.MaterialUsageRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MaterialUsageRecordsController {
    @Autowired
    private MaterialUsageRecordsService materialUsageRecordsService;

    @CrossOrigin
    @GetMapping(value = "api/carrepairmgmt/materialusagerecords/getall")
    @ResponseBody
    public List<MaterialUsageRecord> doGetAll() {
        return materialUsageRecordsService.getAll();
    }

    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/materialusagerecords/save")
    @ResponseBody
    public Result doSave(@RequestBody MaterialUsageRecord record) {
        record.setRecordId(0);
        int res = materialUsageRecordsService.save(record);

        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/materialusagerecords/delete")
    @ResponseBody
    public Result doDelete(@RequestBody MaterialUsageRecord record) {
        int res = materialUsageRecordsService.delete(record);
        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }


    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/materialusagerecords/update")
    @ResponseBody
    public Result doUpdate(@RequestBody MaterialUsageRecord record) {
        int res = materialUsageRecordsService.update(record);
        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }
}
