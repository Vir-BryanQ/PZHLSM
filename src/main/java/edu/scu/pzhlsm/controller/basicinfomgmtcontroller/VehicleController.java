package edu.scu.pzhlsm.controller.basicinfomgmtcontroller;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Vehicle;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.basicinfomgmtservice.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @CrossOrigin
    @GetMapping("api/basicinfomgmt/vehicle/getall")
    public List<Vehicle> queryAllStaff(){
        List<Vehicle> vehicleList = vehicleService.queryAll();
        return vehicleList;
    }


    @CrossOrigin
    @GetMapping("api/basicinfomgmt/vehicle/getbyid")
    public Vehicle querryById(@RequestParam(defaultValue = "1") int id){
        Vehicle vehicle= vehicleService.querryById(id);
        return vehicle;
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/vehicle/getbycondition")
    public List<Vehicle> queryByCondition(@RequestBody Vehicle vehicle){
        List<Vehicle> vehicleList = vehicleService.queryByCondition(vehicle.getVehicleNumber());
        return vehicleList;
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/vehicle/save")
    public Result insertVehicle(@RequestBody Vehicle vehicle){
        int result = vehicleService.insertVehicle(vehicle);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/vehicle/delete")
    public Result deleteVehicle(@RequestBody Vehicle vehicle){
        int result = vehicleService.deleteVehicle(vehicle.getVehicleId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/vehicle/update")
    public Result updataVehicle(@RequestBody Vehicle vehicle){
        int result = vehicleService.updataVehicle(vehicle);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }
}
