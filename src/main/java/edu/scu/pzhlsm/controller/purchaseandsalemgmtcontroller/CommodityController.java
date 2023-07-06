package edu.scu.pzhlsm.controller.purchaseandsalemgmtcontroller;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.CommodityPsi;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.purchaseandsalemgmtservice.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommodityController {
    @Autowired
    private CommodityService commodityService;
//    private CommodityPsi commodityPsi_test = new CommodityPsi("拖鞋", 2,"2022-3-8" ,21 ,"");
//    private CommodityPsi commodityPsi_test2 = new CommodityPsi(3,"拖鞋2", 2,"2022-3-8" ,21 ,"");

    @CrossOrigin
    @GetMapping("api/purchaseandsalemgmt/commoditypsi/getall")
    public List<CommodityPsi> queryAllCommodityPsi(){
        List<CommodityPsi> commodityPsiList = commodityService.queryAll();
        return commodityPsiList;
    }

    @CrossOrigin
    @GetMapping("api/purchaseandsalemgmt/commoditypsi/getbyid")
    public CommodityPsi queryById(@RequestParam(defaultValue = "2") int id){
        CommodityPsi commodityPsi = commodityService.queryById(id);
        return commodityPsi;
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/commoditypsi/getbycondition")
    public List<CommodityPsi> queryByCondition(@RequestBody CommodityPsi commodityPsi){
        List<CommodityPsi> commodityPsiList = commodityService.queryByCondition(commodityPsi.getCommodityName(), commodityPsi.getCreateTime());
        return commodityPsiList;
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/commoditypsi/save")
    public Result insertCommodityPsi(@RequestBody CommodityPsi commodityPsi){
        int result = commodityService.addCommodityPsi(commodityPsi);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);

        }
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/commoditypsi/delete")
    public Result deleteCommodityPsi(@RequestBody CommodityPsi commodityPsi){
        int result = commodityService.deleteCommodityPsi(commodityPsi.getCommodityId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/purchaseandsalemgmt/commoditypsi/update")
    public Result reviseCommodityPsi(@RequestBody CommodityPsi commodityPsi){
        int result = commodityService.reviseCommodityPsi(commodityPsi);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }
}
