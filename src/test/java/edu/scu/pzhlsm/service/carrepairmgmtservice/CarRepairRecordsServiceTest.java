package edu.scu.pzhlsm.service.carrepairmgmtservice;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.CarRepairRecord;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CarRepairRecordsServiceTest {
    @Autowired
    private CarRepairRecordsService carRepairRecordsService;

    @Test
    public void saveTest() {
        CarRepairRecord record = new CarRepairRecord(1, 8888, "xxx", "yyy",
                "zzz", 29999.00);

        int res = carRepairRecordsService.save(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void updateTest() {
        CarRepairRecord record = new CarRepairRecord(1, 8888, "xxxxx", "yyy",
                "zzz", 29999.00);

        int res = carRepairRecordsService.update(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void getAllTest() {
        List<CarRepairRecord> records = carRepairRecordsService.getAll();
        for (CarRepairRecord r : records) {
            System.out.println(r);
        }
    }

    @Test
    public void deleteTest() {
        CarRepairRecord record = new CarRepairRecord(1);

        int res = carRepairRecordsService.delete(record);
        Assert.assertEquals(1, res);
    }
}
