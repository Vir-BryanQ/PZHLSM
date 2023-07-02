package edu.scu.pzhlsm.service.carrepairmgmtservice;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.MaterialUsageRecord;
import edu.scu.pzhlsm.service.carrepairmgmtservice.MaterialUsageRecordsService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MaterialUsageRecordsServiceTest {
    @Autowired
    private MaterialUsageRecordsService materialUsageRecordsService;

    @Test
    public void saveTest() {
        MaterialUsageRecord record = new MaterialUsageRecord(1, 8888, "xxx", "yyy",
                29999.00, "zzz");

        int res = materialUsageRecordsService.save(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void updateTest() {
        MaterialUsageRecord record = new MaterialUsageRecord(1, 8888, "xxxxx", "yyy",
                29999.00, "zzz");

        int res = materialUsageRecordsService.update(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void getAllTest() {
        List<MaterialUsageRecord> records = materialUsageRecordsService.getAll();
        for (MaterialUsageRecord r : records) {
            System.out.println(r);
        }
    }

    @Test
    public void deleteTest() {
        MaterialUsageRecord record = new MaterialUsageRecord(1);

        int res = materialUsageRecordsService.delete(record);
        Assert.assertEquals(1, res);
    }
}
