package edu.scu.pzhlsm.controller.carrepairmgmt;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.RepairWorkerMaintenanceRecord;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.carrepairmgmtservice.RepairWorkerMaintenanceRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RepairWorkerMaintenanceRecordsController {
    @Autowired
    private RepairWorkerMaintenanceRecordsService repairWorkerMaintenanceRecordsService;

    @CrossOrigin
    @GetMapping(value = "api/carrepairmgmt/repairworkermaintenancerecords/getall")
    @ResponseBody
    public List<RepairWorkerMaintenanceRecord> doGetAll() {
        return repairWorkerMaintenanceRecordsService.getAll();
    }

    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/repairworkermaintenancerecords/save")
    @ResponseBody
    public Result doSave(@RequestBody RepairWorkerMaintenanceRecord record) {
        record.setRecordId(0);
        int res = repairWorkerMaintenanceRecordsService.save(record);

        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/repairworkermaintenancerecords/delete")
    @ResponseBody
    public Result doDelete(@RequestBody RepairWorkerMaintenanceRecord record) {
        int res = repairWorkerMaintenanceRecordsService.delete(record);
        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }


    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/repairworkermaintenancerecords/update")
    @ResponseBody
    public Result doUpdate(@RequestBody RepairWorkerMaintenanceRecord record) {
        int res = repairWorkerMaintenanceRecordsService.update(record);
        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }
}
