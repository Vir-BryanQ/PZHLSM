package edu.scu.pzhlsm.service.carrepairmgmtservice;

import edu.scu.pzhlsm.dao.carrepairmgmtdao.CarRepairRecordsDAO;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.CarRepairRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
