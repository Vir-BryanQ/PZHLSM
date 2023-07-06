package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.CommodityPsi;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.OfficeConsumable;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class OfficeConsumableTest {

    @Autowired
    private OfficeConsumableService officeConsumableService;

    @Test
    public void saveTest(){
        OfficeConsumable officeConsumable = new OfficeConsumable(1,"测试", 20,
                "2012-03-23", 2,  "");
        int res = officeConsumableService.addConsumable(officeConsumable);
        Assert.assertEquals(1, res);
    }

    @Test
    public void deleteTest(){

        int res = officeConsumableService.deleteConsumable(3);
        Assert.assertEquals(1, res);
    }

    @Test
    public void updateTest(){
        OfficeConsumable officeConsumable = new OfficeConsumable(5,"更新测试", 20,
                "2012-09-09", 2,  "");
        int res = officeConsumableService.reviseConsumable(officeConsumable);
        Assert.assertEquals(1, res);
    }

    @Test
    public void getAllTest(){
        List<OfficeConsumable> officeConsumableList = officeConsumableService.queryAll();
        for (OfficeConsumable officeConsumable : officeConsumableList) {
            System.out.println(officeConsumable);
        }
    }
}
