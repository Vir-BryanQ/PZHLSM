package edu.scu.pzhlsm.controller.basicinfomgmtcontroller;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Goods;
import edu.scu.pzhlsm.result.Result;
import edu.scu.pzhlsm.service.basicinfomgmtservice.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @CrossOrigin
    @GetMapping("api/basicinfomgmt/goods/getall")
    public List<Goods> queryAllStaff(){
        List<Goods> goodsList = goodsService.queryAll();
        return goodsList;
    }

    @CrossOrigin
    @GetMapping("api/basicinfomgmt/goods/getbyid")
    public Goods querryById(@RequestParam(defaultValue = "1") int id){
        Goods goods= goodsService.querryById(id);
        return goods;
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/goods/getbycondition")
    public List<Goods> queryByCondition(@RequestBody Goods goods){
        List<Goods> goodsfList = goodsService.queryByCondition(goods.getGoodsType());
        return goodsfList;
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/goods/save")
    public Result insertGoods(@RequestBody Goods goods){
        int result = goodsService.insertGoods(goods);
        if(result > 0){
            System.out.println("添加成功");
            return new Result(200);
        }else {
            System.out.println("添加失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/goods/delete")
    public Result deleteGoods(@RequestBody Goods goods){
        int result = goodsService.deleteGoods(goods.getGoodsId());
        if(result > 0){
            System.out.println("删除成功");
            return new Result(200);
        }else {
            System.out.println("删除失败");
            return new Result(400);
        }
    }

    @CrossOrigin
    @PostMapping("api/basicinfomgmt/goods/update")
    public Result updataGoods(@RequestBody Goods goods){
        int result = goodsService.updataGoods(goods);
        if(result > 0){
            System.out.println("修改成功");
            return new Result(200);
        }else {
            System.out.println("修改失败");
            return new Result(400);
        }
    }
}
