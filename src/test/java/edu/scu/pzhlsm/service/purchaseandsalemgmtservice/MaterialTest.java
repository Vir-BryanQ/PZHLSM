package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.CommodityPsi;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.MaterialPsi;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MaterialTest {
    @Autowired
    private MaterialService materialService;

    @Test
    public void saveTest(){
        MaterialPsi materialPsi = new MaterialPsi(1,"测试", 20, 0,
                "2012-03-23", 2,  "");
        int res = materialService.addMaterialPsi(materialPsi);
        Assert.assertEquals(1, res);
    }

    @Test
    public void deleteTest(){

        int res = materialService.deleteMaterialPsi(13);
        Assert.assertEquals(1, res);
    }

    @Test
    public void updateTest(){
        MaterialPsi materialPsi = new MaterialPsi(3,"更新测试", 20, 0,
                "2012-09-09", 2,  "");
        int res = materialService.reviseMaterialPsi(materialPsi);
        Assert.assertEquals(1, res);
    }

    @Test
    public void getAllTest(){
        List<MaterialPsi> materialPsiList = materialService.queryAll();
        for (MaterialPsi materialPsi : materialPsiList) {
            System.out.println(materialPsi);
        }
    }
}
