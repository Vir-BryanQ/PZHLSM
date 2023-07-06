package edu.scu.pzhlsm.controller.basicinfomgmtcontroller;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Resource;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.basicinfomgmtservice.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    @CrossOrigin
    @GetMapping("api/basicinfomgmt/resource/getall")
    public List<Resource> queryAllList(){
        List<Resource> resourceList = resourceService.queryAll();
        return resourceList;
    }

    @CrossOrigin
    @GetMapping("api/basicinfomgmt/resource/getbyid")
    public Resource queryById(@RequestParam(defaultValue = "1") int id){
        Resource resource= resourceService.querryById(id);
        return resource;
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/resource/getbycondition")
    public List<Resource> queryByCondition(@RequestBody Resource resource){
        List<Resource> resourceList = resourceService.queryByCondition(resource.getResourceName());
        return resourceList;
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/resource/save")
    public Result insertResource(@RequestBody Resource resource){
        int result = resourceService.insertResource(resource);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/resource/delete")
    public Result deleteResource(@RequestBody Resource resource){
        int result = resourceService.deleteResource(resource.getResourceId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/resource/update")
    public Result updateResource(@RequestBody Resource resource){
        int result = resourceService.updataResource(resource);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }
}
