package edu.scu.pzhlsm.controller.purchaseandsalemgmtcontroller;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.MaterialPsi;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.purchaseandsalemgmtservice.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaterialController {
    @Autowired
    private MaterialService materialService;
    private MaterialPsi materialPsi_test = new MaterialPsi("盆子", 50, 1, "2020-12-1", 5,"");
    private MaterialPsi materialPsi_test2 = new MaterialPsi(3,"盆子1", 50, 1, "2020-12-1", 5,"");

    @CrossOrigin
    @GetMapping("api/purchaseandsalemgmt/materialpsi/getall")
    public List<MaterialPsi> queryAllMaterialPsi(){
        List<MaterialPsi> materialPsiList = materialService.queryAll();
        return materialPsiList;
    }

    @CrossOrigin
    @GetMapping("api/purchaseandsalemgmt/materialpsi/getbyid")
    public MaterialPsi queryById(@RequestParam(defaultValue = "2") int id){
        MaterialPsi materialPsi = materialService.queryById(id);
        return materialPsi;
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/materialpsi/save")
    public Result insertMaterialPsi(@RequestBody MaterialPsi materialPsi){
        int result = materialService.addMaterialPsi(materialPsi);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/materialpsi/delete")
    public Result deleteMaterialPsi(@RequestBody MaterialPsi materialPsi){
        int result = materialService.deleteMaterialPsi(materialPsi.getMaterialId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/materialpsi/update")
    public Result reviseMaterialPsi(@RequestBody MaterialPsi materialPsi){
        int result = materialService.reviseMaterialPsi(materialPsi);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }

}
