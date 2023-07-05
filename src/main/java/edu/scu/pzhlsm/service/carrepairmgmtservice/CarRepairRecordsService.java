package edu.scu.pzhlsm.service.carrepairmgmtservice;

import edu.scu.pzhlsm.dao.carrepairmgmtdao.CarRepairRecordsDAO;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.CarRepairRecord;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.BuildingTransactionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarRepairRecordsService {
    @Autowired
    private CarRepairRecordsDAO carRepairRecordsDAO;

    public int save(CarRepairRecord record) {
        return carRepairRecordsDAO.saveCarRepairRecord(record);
    }

    public int delete(CarRepairRecord record) {
        return carRepairRecordsDAO.deleteCarRepairRecord(record);
    }

    public int update(CarRepairRecord record) {
        return carRepairRecordsDAO.updateCarRepairRecord(record);
    }

    public List<CarRepairRecord> getAll() {
        return  carRepairRecordsDAO.findAll();
    }

    public List<CarRepairRecord> searchByRepairDate(CarRepairRecord record) {
        List<CarRepairRecord> carRepairRecordList = carRepairRecordsDAO.findAll();
        List<CarRepairRecord> searchResults = new ArrayList<>();
        for (CarRepairRecord carRepairRecord : carRepairRecordList) {
            String dateToMatch = record.getRepairDate();
            String repairDate = carRepairRecord.getRepairDate();

            if (dateToMatch != null) {
                if (repairDate != null && repairDate.contains(dateToMatch)) {
                    searchResults.add(carRepairRecord);
                }
            } else {
                searchResults.add(carRepairRecord);
            }
        }

        return searchResults;
    }
}
