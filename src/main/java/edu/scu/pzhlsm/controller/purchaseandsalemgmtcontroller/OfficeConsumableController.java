package edu.scu.pzhlsm.controller.purchaseandsalemgmtcontroller;


import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.OfficeConsumable;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.purchaseandsalemgmtservice.OfficeConsumableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OfficeConsumableController {
    @Autowired
    private OfficeConsumableService officeConsumableService;
    private OfficeConsumable officeConsumable_test = new OfficeConsumable( "稿纸",20 ,"2022-1-3" ,5 , "");
    private OfficeConsumable officeConsumable_test2 = new OfficeConsumable( 4,"尺子1",20 ,"2022-1-3" ,10 , "");

    @CrossOrigin
    @GetMapping("api/purchaseandsalemgmt/officeconsumables/getall")
    public List<OfficeConsumable> queryAllOfficeConsumables(){
        List<OfficeConsumable> officeConsumableList = officeConsumableService.queryAll();
        return officeConsumableList;
    }

    @CrossOrigin
    @GetMapping("api/purchaseandsalemgmt/officeconsumables/getbyid")
    public OfficeConsumable queryById(@RequestParam(defaultValue = "1") int consumableId){
        OfficeConsumable officeConsumable = officeConsumableService.queryById(consumableId);
        return officeConsumable;
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/officeconsumables/save")
    public Result insertConsumable(@RequestBody OfficeConsumable officeConsumable){
        int result = officeConsumableService.addConsumable(officeConsumable);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/officeconsumables/delete")
    public Result deleteConsumable(@RequestBody OfficeConsumable officeConsumable){
        int result = officeConsumableService.deleteConsumable(officeConsumable.getOfficeConsumablesId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/officeconsumables/update")
    public Result reviseConsumable(@RequestBody OfficeConsumable officeConsumable){
        int result = officeConsumableService.reviseConsumable(officeConsumable);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }
}
