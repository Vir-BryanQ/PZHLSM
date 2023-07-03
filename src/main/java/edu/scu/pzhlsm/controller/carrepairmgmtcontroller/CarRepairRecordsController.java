package edu.scu.pzhlsm.controller.carrepairmgmtcontroller;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.CarRepairRecord;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.carrepairmgmtservice.CarRepairRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CarRepairRecordsController {

    @Autowired
    private CarRepairRecordsService carRepairRecordsService;

    @CrossOrigin
    @GetMapping(value = "api/carrepairmgmt/carrepairrecords/getall")
    @ResponseBody
    public List<CarRepairRecord> doGetAll() {
        return carRepairRecordsService.getAll();
    }

    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/carrepairrecords/save")
    @ResponseBody
    public Result doSave(@RequestBody CarRepairRecord record) {
        record.setRecordId(0);
        int res = carRepairRecordsService.save(record);

        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/carrepairrecords/delete")
    @ResponseBody
    public Result doDelete(@RequestBody CarRepairRecord record) {
        int res = carRepairRecordsService.delete(record);
        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }


    @CrossOrigin
    @PostMapping(value = "api/carrepairmgmt/carrepairrecords/update")
    @ResponseBody
    public Result doUpdate(@RequestBody CarRepairRecord record) {
        int res = carRepairRecordsService.update(record);
        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }
}
