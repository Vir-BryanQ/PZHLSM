package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.CommodityPsi;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.VehiclePsi;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class VehiclepsiTest {
    @Autowired
    private VehiclepsiService vehiclepsiService;

    @Test
    public void saveTest(){
        VehiclePsi vehiclePsi = new VehiclePsi(1,"测试","测试", 20, 0,
                "2012-03-23", 2,  "");
        int res = vehiclepsiService.addVehiclePsi(vehiclePsi);
        Assert.assertEquals(1, res);
    }

    @Test
    public void deleteTest(){

        int res = vehiclepsiService.deleteVehiclePsi(8);
        Assert.assertEquals(1, res);
    }

    @Test
    public void updateTest(){
        VehiclePsi commodityPsi = new VehiclePsi(6,"更新测试", "更新测试", 20, 0,
                "2012-09-09", 2,  "");
        int res = vehiclepsiService.reviseVehiclePsi(commodityPsi);
        Assert.assertEquals(1, res);
    }

    @Test
    public void getAllTest(){
        List<VehiclePsi> vehiclePsiList = vehiclepsiService.queryAll();
        for (VehiclePsi vehiclePsi : vehiclePsiList) {
            System.out.println(vehiclePsi);
        }
    }
}
