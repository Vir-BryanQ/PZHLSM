package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.dao.purchaseandsalemgmtdao.CommodityDao;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.CommodityPsi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {
    @Autowired
    private CommodityDao commodityDao;

    public List<CommodityPsi> queryAll(){
        List<CommodityPsi> commodityPsiList = commodityDao.queryAllList();
        commodityPsiList.forEach(commodityPsi -> {
            System.out.println(commodityPsi);
        });
        return commodityPsiList;
    }

    public CommodityPsi queryById(int id){
        CommodityPsi commodityPsi = commodityDao.queryById(id);
        System.out.println(commodityPsi);
        return commodityPsi;
    }

    public List<CommodityPsi> queryByCondition(String name, String time){
        List<CommodityPsi> commodityPsiList = commodityDao.queryByCondition(name, time);
        commodityPsiList.forEach(commodityPsi -> {
            System.out.println(commodityPsi);
        });
        return commodityPsiList;
    }

    public int addCommodityPsi(CommodityPsi commodityPsi){
        int result = commodityDao.insertCommodityPsi(commodityPsi);
        return result;
    }

    public int deleteCommodityPsi(int id){
        int result = commodityDao.deleteCommodityPsi(id);
        return result;
    }

    public int reviseCommodityPsi(CommodityPsi commodityPsi){
        int result = commodityDao.updateCommodityPsi(commodityPsi);
        return result;
    }
}
