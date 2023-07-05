package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.dao.purchaseandsalemgmtdao.BuildingTransactionRecordsDAO;
import edu.scu.pzhlsm.pojo.User;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.BuildingTransactionRecord;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<BuildingTransactionRecord> searchByBuyerNameOrTransactionDate(BuildingTransactionRecord record) {
        List<BuildingTransactionRecord> buildingTransactionRecordList = buildingTransactionRecordsDAO.findAll();
        List<BuildingTransactionRecord> searchResults = new ArrayList<>();
        for (BuildingTransactionRecord buildingTransactionRecord : buildingTransactionRecordList) {
            String nameToMatch = record.getTenantBuyerName();
            String dateToMatch = record.getTransactionDate();
            String buyerName = buildingTransactionRecord.getTenantBuyerName();
            String transactionDate = buildingTransactionRecord.getTransactionDate();

            if (nameToMatch != null) {
                if (buyerName != null && buyerName.contains(nameToMatch)) {
                    if (dateToMatch != null) {
                        if (transactionDate != null && transactionDate.contains(dateToMatch)) {
                            searchResults.add(buildingTransactionRecord);
                        }
                    } else {
                        searchResults.add(buildingTransactionRecord);
                    }
                }
            } else {
                if (dateToMatch != null) {
                    if (transactionDate != null && transactionDate.contains(dateToMatch)) {
                        searchResults.add(buildingTransactionRecord);
                    }
                } else {
                    searchResults.add(buildingTransactionRecord);
                }
            }
        }

        return searchResults;
    }
}
