package edu.scu.pzhlsm.service.carrepairmgmtservice;

import edu.scu.pzhlsm.dao.carrepairmgmtdao.RepairWorkerMaintenanceRecordsDAO;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.RepairWorkerMaintenanceRecord;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.RepairWorkerMaintenanceRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepairWorkerMaintenanceRecordsService {
    @Autowired
    private RepairWorkerMaintenanceRecordsDAO repairWorkerMaintenanceRecordsDAO;

    public int save(RepairWorkerMaintenanceRecord record) {
        return repairWorkerMaintenanceRecordsDAO.saveRepairWorkerMaintenanceRecord(record);
    }

    public int delete(RepairWorkerMaintenanceRecord record) {
        return repairWorkerMaintenanceRecordsDAO.deleteRepairWorkerMaintenanceRecord(record);
    }

    public int update(RepairWorkerMaintenanceRecord record) {
        return repairWorkerMaintenanceRecordsDAO.updateRepairWorkerMaintenanceRecord(record);
    }

    public List<RepairWorkerMaintenanceRecord> getAll() {
        return  repairWorkerMaintenanceRecordsDAO.findAll();
    }

    public List<RepairWorkerMaintenanceRecord> searchByMaintenanceDate(RepairWorkerMaintenanceRecord record) {
        List<RepairWorkerMaintenanceRecord> repairWorkerMaintenanceRecordList = repairWorkerMaintenanceRecordsDAO.findAll();
        List<RepairWorkerMaintenanceRecord> searchResults = new ArrayList<>();
        for (RepairWorkerMaintenanceRecord repairWorkerMaintenanceRecord : repairWorkerMaintenanceRecordList) {
            String dateToMatch = record.getMaintenanceDate();
            String maintenanceDate = repairWorkerMaintenanceRecord.getMaintenanceDate();

            if (dateToMatch != null) {
                if (maintenanceDate != null && maintenanceDate.contains(dateToMatch)) {
                    searchResults.add(repairWorkerMaintenanceRecord);
                }
            } else {
                searchResults.add(repairWorkerMaintenanceRecord);
            }
        }

        return searchResults;
    }
}
