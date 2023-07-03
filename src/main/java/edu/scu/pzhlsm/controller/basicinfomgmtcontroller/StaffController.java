package edu.scu.pzhlsm.controller.basicinfomgmtcontroller;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.basicinfomgmtservice.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {
    @Autowired
    StaffService staffService;

    @CrossOrigin
    @GetMapping("api/basicinfomgmt/staff/getall")
    public List<Staff> queryAllStaff(){
        List<Staff> staffList = staffService.queryAll();
        return staffList;
    }

    @CrossOrigin
    @GetMapping("api/basicinfomgmt/staff/getbyid")
    public Staff querryById(@RequestParam(defaultValue = "1") int id){
        Staff staff= staffService.querryById(id);
        return staff;
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/staff/save")
    public Result insertStaff(@RequestBody Staff staff){
        int result = staffService.insertStaff(staff);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/staff/delete")
    public Result deleteStaff(@RequestBody Staff staff){
        int result = staffService.deleteStaff(staff.getStaffId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/staff/update")
    public Result updataStaff(@RequestBody Staff staff){
        int result = staffService.updataStaff(staff);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }
}
