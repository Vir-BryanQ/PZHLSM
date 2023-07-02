package edu.scu.pzhlsm.service.carrepairmgmtservice;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.RepairWorkerMaintenanceRecord;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RepairWorkerMaintenanceRecordsServiceTest {
    @Autowired
    private RepairWorkerMaintenanceRecordsService repairWorkerMaintenanceRecordsService;

    @Test
    public void saveTest() {
        RepairWorkerMaintenanceRecord record = new RepairWorkerMaintenanceRecord(1, 8888, 9999,
                "yyy", "zzz", 29999.00);

        int res = repairWorkerMaintenanceRecordsService.save(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void updateTest() {
        RepairWorkerMaintenanceRecord record = new RepairWorkerMaintenanceRecord(1, 8888, 9999,
                "yyy", "zzz", 29999.00);

        int res = repairWorkerMaintenanceRecordsService.update(record);
        Assert.assertEquals(1, res);
    }

    @Test
    public void getAllTest() {
        List<RepairWorkerMaintenanceRecord> records = repairWorkerMaintenanceRecordsService.getAll();
        for (RepairWorkerMaintenanceRecord r : records) {
            System.out.println(r);
        }
    }

    @Test
    public void deleteTest() {
        RepairWorkerMaintenanceRecord record = new RepairWorkerMaintenanceRecord(1);

        int res = repairWorkerMaintenanceRecordsService.delete(record);
        Assert.assertEquals(1, res);
    }
}
