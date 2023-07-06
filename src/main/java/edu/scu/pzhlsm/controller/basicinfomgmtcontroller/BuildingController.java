package edu.scu.pzhlsm.controller.basicinfomgmtcontroller;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Building;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Vehicle;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.basicinfomgmtservice.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuildingController {

    @Autowired
    BuildingService buildingService;
    @CrossOrigin
    @GetMapping("api/basicinfomgmt/building/getall")
    public List<Building> queryAllStaff(){
        List<Building> buildingList = buildingService.queryAll();
        return buildingList;
    }


    @CrossOrigin
    @GetMapping("api/basicinfomgmt/building/getbyid")
    public Building querryById(@RequestParam(defaultValue = "1") int id){
        Building building= buildingService.querryById(id);
        return building;
    }
    @CrossOrigin
    @PostMapping("api/basicinfomgmt/building/getbycondition")
    public List<Building> queryByCondition(@RequestBody Building building){
        List<Building> buildingList = buildingService.queryByCondition(building.getBuildingName());
        return buildingList;
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/building/save")
    public Result insertVehicle(@RequestBody Building building){
        int result = buildingService.insertBuilding(building);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/building/delete")
    public Result deleteVehicle(@RequestBody Building building){
        int result = buildingService.deleteBuilding(building.getBuildingId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/building/update")
    public Result updataVehicle(@RequestBody Building building){
        int result = buildingService.updataBuilding(building);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }
}
