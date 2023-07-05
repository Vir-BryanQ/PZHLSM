package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.dao.transscheduledao.RailwayMissionRecordDAO;
import edu.scu.pzhlsm.pojo.transschedulepojo.RailwayMissionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RailwayMissionRecordService {
    @Autowired
    private RailwayMissionRecordDAO railwayMissionRecordDAO;

    public List<RailwayMissionRecord> selectAll(){
        return railwayMissionRecordDAO.selectAll();
    }

    public RailwayMissionRecord selectOne(int carId){
        return railwayMissionRecordDAO.selectOne(carId);
    }

    public int update(RailwayMissionRecord railwayMissionRecord){
        return railwayMissionRecordDAO.update(railwayMissionRecord);
    }

    public List<RailwayMissionRecord> dynamicQuery(Map<String, Object> map){
        return railwayMissionRecordDAO.dynamicQuery(map);
    }

    public int insert(RailwayMissionRecord railwayMissionRecord){
        railwayMissionRecordDAO.insert(railwayMissionRecord);
        return railwayMissionRecord.getMissionId();
    }
}
