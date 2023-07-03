package edu.scu.pzhlsm.controller.purchaseandsalemgmtcontroller;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.VehiclePsi;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.purchaseandsalemgmtservice.VehiclepsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehiclepsiController {

    @Autowired
    private VehiclepsiService vehiclepsiService;
    private VehiclePsi vehiclePsi_test = new VehiclePsi("比亚迪", "汉", 2, 0, "20222-1-13", 25, "");
    private VehiclePsi vehiclePsi_test2 = new VehiclePsi("比亚迪", "宋", 2, 0, "20222-1-13", 25, "");

    @CrossOrigin
    @GetMapping("api/purchaseandsalemgmt/automobilepurchase/getall")
    public List<VehiclePsi> queryAllVehiclePsi(){
        List<VehiclePsi> vehiclePsiList = vehiclepsiService.queryAll();
        return vehiclePsiList;
    }

    @CrossOrigin
    @GetMapping("api/purchaseandsalemgmt/automobilepurchase/getbyid")
    public VehiclePsi queryById(@RequestParam(defaultValue = "2") int id){
        VehiclePsi vehiclePsi = vehiclepsiService.queryById(id);
        return vehiclePsi;
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/automobilepurchase/save")
    public Result insertVehiclePsi(@RequestBody VehiclePsi vehiclePsi){
        int result = vehiclepsiService.addVehiclePsi(vehiclePsi);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/automobilepurchase/delete")
    public Result deleteCommodityPsi(@RequestBody VehiclePsi vehiclePsi){
        int result = vehiclepsiService.deleteVehiclePsi(vehiclePsi.getVehicleId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }

    }
    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/automobilepurchase/update")
    public Result reviseCommodityPsi(@RequestBody VehiclePsi vehiclePsi){
        int result = vehiclepsiService.reviseVehiclePsi(vehiclePsi);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }
}
