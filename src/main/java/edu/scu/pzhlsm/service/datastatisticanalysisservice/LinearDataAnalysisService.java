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
        try {
            List<Integer> missionFinished = new ArrayList<>();
            List<MissionRecord> missionRecordList = missionRecordDAO.selectAll();
            for (String date : dates) {
                Integer count = 0;
                for (MissionRecord missionRecord : missionRecordList) {
                    String temp = missionRecord.getMissionFinishTime();
                    if (temp!= null && temp.contains(date)) {
                        count++;
                    }
                }
                missionFinished.add(count);
            }
            return missionFinished;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public List<Integer> monthCarRepairRecord(List<String> dates){
        try {
            List<Integer> carRepaired = new ArrayList<>();
            List<CarRepairRecord> carRepairRecordList = carRepairRecordsDAO.findAll();
            for (String date : dates) {
                Integer count = 0;
                for (CarRepairRecord carRepairRecord : carRepairRecordList) {
                    String temp = carRepairRecord.getRepairDate();
                    if (temp!=null && temp.contains(date)) {
                        count++;
                    }
                }
                carRepaired.add(count);
            }
            return carRepaired;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
