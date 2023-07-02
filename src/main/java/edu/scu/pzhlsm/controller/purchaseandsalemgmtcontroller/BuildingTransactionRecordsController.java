package edu.scu.pzhlsm.controller.purchaseandsalemgmtcontroller;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.BuildingTransactionRecord;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.purchaseandsalemgmtservice.BuildingTransactionRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BuildingTransactionRecordsController {

    @Autowired
    private BuildingTransactionRecordsService buildingTransactionRecordsService;

    @CrossOrigin
    @GetMapping(value = "api/purchaseandsalemgmt/buildingtransactionrecords/getall")
    @ResponseBody
    public List<BuildingTransactionRecord> doGetAll() {
        return buildingTransactionRecordsService.getAll();
    }

    @CrossOrigin
    @PostMapping(value = "api/purchaseandsalemgmt/buildingtransactionrecords/save")
    @ResponseBody
    public Result doSave(@RequestBody BuildingTransactionRecord record) {
        record.setRecordId(0);
        int res = buildingTransactionRecordsService.save(record);

        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping(value = "api/purchaseandsalemgmt/buildingtransactionrecords/delete")
    @ResponseBody
    public Result doDelete(@RequestBody BuildingTransactionRecord record) {
        int res = buildingTransactionRecordsService.delete(record);
        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }


    @CrossOrigin
    @PostMapping(value = "api/purchaseandsalemgmt/buildingtransactionrecords/update")
    @ResponseBody
    public Result doUpdate(@RequestBody BuildingTransactionRecord record) {
        int res = buildingTransactionRecordsService.update(record);
        if (res == 1) {
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

}
