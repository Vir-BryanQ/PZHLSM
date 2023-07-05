package edu.scu.pzhlsm.service.datastatisticanalysisservice;

import edu.scu.pzhlsm.dao.transscheduledao.MissionRecordDAO;
import edu.scu.pzhlsm.result.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExportBusinessDistributedStatsService {
    @Autowired
    MissionRecordDAO recordDAO;

    String[] zoneOfChengDu = {"锦江区", "青羊区", "金牛区", "武侯区", "成华区", "龙泉驿区",
            "新都区", "郫都区", "温江区","双流区", "青白江区", "新津区"};

    public List<Integer> export(String year){
        //Map<String, Object> ret = new HashMap<>();
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            ret.add(recordDAO.getNumOfYearByDestination(year, zoneOfChengDu[i]));
        }
        return ret;
    }
}
