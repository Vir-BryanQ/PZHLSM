package edu.scu.pzhlsm.service.basicinfomgmtservice;

import edu.scu.pzhlsm.dao.basicinfomgmtdao.GoodsDao;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Goods;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    GoodsDao goodsDao;

    public List<Goods> queryAll(){
        List<Goods> goodsList = goodsDao.queryAllList();
//        goodsList.forEach(goods -> {
//            System.out.println(goods);
//        });
        return goodsList;
    }

    public Goods querryById(int id){
        Goods goods = goodsDao.queryById(id);
//        System.out.println(goods);
        return goods;
    }

    public List<Goods> queryByCondition(String type){
        List<Goods> goodsfList = goodsDao.queryByCondition(type);
        return goodsfList;
    }

    public int insertGoods(Goods goods){
        int result = goodsDao.insertGoods(goods);
        return result;
    }

    public int deleteGoods(int id){
        int result = goodsDao.deleteGoods(id);
        return result;
    }

    public int updataGoods(Goods staff){
        int result = goodsDao.updateGoods(staff);
        return result;
    }
}
