package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.CommodityPsi;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CommodityTest {
    @Autowired
    private CommodityService commodityService;

    @Test
    public void saveTest(){
        CommodityPsi commodityPsi = new CommodityPsi(1,"测试", 20, 0,
                "2012-03-23", 2,  "");
        int res = commodityService.addCommodityPsi(commodityPsi);
        Assert.assertEquals(1, res);
    }

    @Test
    public void deleteTest(){

        int res = commodityService.deleteCommodityPsi(2);
        Assert.assertEquals(1, res);
    }

    @Test
    public void updateTest(){
        CommodityPsi commodityPsi = new CommodityPsi(10,"更新测试", 20, 0,
                "2012-09-09", 2,  "");
        int res = commodityService.reviseCommodityPsi(commodityPsi);
        Assert.assertEquals(1, res);
    }

    @Test
    public void getAllTest(){
        List<CommodityPsi> commodityPsiList = commodityService.queryAll();
        for (CommodityPsi commodityPsi : commodityPsiList) {
            System.out.println(commodityPsi);
        }
    }

}
