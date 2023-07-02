package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.dao.purchaseandsalemgmtdao.BuildingTransactionRecordsDAO;
import edu.scu.pzhlsm.pojo.User;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.BuildingTransactionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingTransactionRecordsService {
    @Autowired
    private BuildingTransactionRecordsDAO buildingTransactionRecordsDAO;

    public int save(BuildingTransactionRecord record) {
        return buildingTransactionRecordsDAO.saveBuildingTransactionRecord(record);
    }

    public int delete(BuildingTransactionRecord record) {
        return buildingTransactionRecordsDAO.deleteBuildingTransactionRecord(record);
    }

    public int update(BuildingTransactionRecord record) {
        return buildingTransactionRecordsDAO.updateBuildingTransactionRecord(record);
    }

    public List<BuildingTransactionRecord> getAll() {
        return  buildingTransactionRecordsDAO.findAll();
    }
}
