package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.BuildingTransactionRecord;
import edu.scu.pzhlsm.service.purchaseandsalemgmtservice.BuildingTransactionRecordsService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BuildingTransactionRecordsTest {

    @Autowired
    private BuildingTransactionRecordsService buildingTransactionRecordsService;

    @Test
    public void saveTest() {
        BuildingTransactionRecord record = new BuildingTransactionRecord(1, 9999, "测试", "大卫",
                                                                "2021-09-09", 29999.00, 300);

        int res = buildingTransactionRecordsService.save(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void deleteTest() {
        BuildingTransactionRecord record = new BuildingTransactionRecord(1);

        int res = buildingTransactionRecordsService.delete(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void updateTest() {
        BuildingTransactionRecord record = new BuildingTransactionRecord(1, 8888, "更新测试", "大卫",
                "2021-09-09", 29999.00, 300);

        int res = buildingTransactionRecordsService.update(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void getAllTest() {
        List<BuildingTransactionRecord> records = buildingTransactionRecordsService.getAll();
        for (BuildingTransactionRecord r : records) {
            System.out.println(r);
        }
    }
}
