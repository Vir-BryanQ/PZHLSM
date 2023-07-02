package edu.scu.pzhlsm.service.carrepairmgmtservice;

import edu.scu.pzhlsm.dao.carrepairmgmtdao.MaterialUsageRecordsDAO;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.MaterialUsageRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
