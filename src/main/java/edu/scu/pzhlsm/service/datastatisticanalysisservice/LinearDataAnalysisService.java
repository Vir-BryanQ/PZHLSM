package edu.scu.pzhlsm.service.datastatisticanalysisservice;

import edu.scu.pzhlsm.dao.carrepairmgmtdao.CarRepairRecordsDAO;
import edu.scu.pzhlsm.dao.transscheduledao.MissionRecordDAO;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.CarRepairRecord;
import edu.scu.pzhlsm.pojo.transschedulepojo.MissionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class LinearDataAnalysisService {
    @Autowired
    private MissionRecordDAO missionRecordDAO;

    @Autowired
    private CarRepairRecordsDAO carRepairRecordsDAO;

    public List<Integer> monthMissionFinishedRecord(List<String> dates){
        List<Integer> missionFinished = new ArrayList<>();
        List<MissionRecord> missionRecordList = missionRecordDAO.selectAll();
        for (String date : dates) {
            Integer count=0;
            for (MissionRecord missionRecord : missionRecordList) {
                if(missionRecord.getMissionFinishTime().contains(date)){
                    count++;
                }
            }
            missionFinished.add(count);
        }
        return missionFinished;
    }

    public List<Integer> monthCarRepairRecord(List<String> dates){
        List<Integer> carRepaired = new ArrayList<>();
        List<CarRepairRecord> carRepairRecordList = carRepairRecordsDAO.findAll();
        for (String date : dates) {
            Integer count=0;
            for (CarRepairRecord carRepairRecord : carRepairRecordList) {
                if(carRepairRecord.getRepairDate().contains(date)){
                    count++;
                }
            }
            carRepaired.add(count);
        }
        return carRepaired;
    }
}
