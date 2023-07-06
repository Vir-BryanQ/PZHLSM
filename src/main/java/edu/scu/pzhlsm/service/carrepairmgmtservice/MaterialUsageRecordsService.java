package edu.scu.pzhlsm.service.carrepairmgmtservice;

import edu.scu.pzhlsm.dao.carrepairmgmtdao.MaterialUsageRecordsDAO;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.MaterialUsageRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialUsageRecordsService {
    @Autowired
    private MaterialUsageRecordsDAO materialUsageRecordsDAO;

    public int save(MaterialUsageRecord record) {
        return materialUsageRecordsDAO.saveMaterialUsageRecord(record);
    }

    public int delete(MaterialUsageRecord record) {
        return materialUsageRecordsDAO.deleteMaterialUsageRecord(record);
    }

    public int update(MaterialUsageRecord record) {
        return materialUsageRecordsDAO.updateMaterialUsageRecord(record);
    }

    public List<MaterialUsageRecord> getAll() {
        return  materialUsageRecordsDAO.findAll();
    }

    public List<MaterialUsageRecord> searchByDepartmentOrUser(MaterialUsageRecord record) {
        List<MaterialUsageRecord> materialUsageRecordList = materialUsageRecordsDAO.findAll();
        List<MaterialUsageRecord> searchResults = new ArrayList<>();
        for (MaterialUsageRecord materialUsageRecord : materialUsageRecordList) {
            String departmentToMatch = record.getDepartment();
            String userToMatch = record.getUser();
            String department = materialUsageRecord.getDepartment();
            String user = materialUsageRecord.getUser();

            if (departmentToMatch != null) {
                if (department != null && department.contains(departmentToMatch)) {
                    if (userToMatch != null) {
                        if (user != null && user.contains(userToMatch)) {
                            searchResults.add(materialUsageRecord);
                        }
                    } else {
                        searchResults.add(materialUsageRecord);
                    }
                }
            } else {
                if (userToMatch != null) {
                    if (user != null && user.contains(userToMatch)) {
                        searchResults.add(materialUsageRecord);
                    }
                } else {
                    searchResults.add(materialUsageRecord);
                }
            }
        }

        return searchResults;
    }
}
