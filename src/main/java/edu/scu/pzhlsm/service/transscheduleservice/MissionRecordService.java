package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.dao.transscheduledao.BusinessRecordDAO;
import edu.scu.pzhlsm.dao.transscheduledao.CarRecordDAO;
import edu.scu.pzhlsm.dao.transscheduledao.MissionRecordDAO;
import edu.scu.pzhlsm.pojo.transschedulepojo.MissionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class MissionRecordService {
    @Autowired
    private MissionRecordDAO missionRecordDAO;
    @Autowired
    private CarRecordDAO carRecordDAO;
    @Autowired
    private BusinessRecordDAO businessRecordDAO;

    public List<MissionRecord> selectAll(){
        return this.missionRecordDAO.selectAll();
    }

    public MissionRecord selectOne(int missionId){
        return this.missionRecordDAO.selectOne(missionId);
    }

    public int update(MissionRecord missionRecord){
        return this.missionRecordDAO.update(missionRecord);
    }

    public List<MissionRecord> dynamicQuery(JSON json){
        Map<String, Object> map = JSON.parseObject(json.toString());
        return this.missionRecordDAO.dynamicQuery(map);
    }

    public int insert(MissionRecord missionRecord) {
        LocalDate localDate = LocalDate.now();
        String createTime = localDate.toString();
        missionRecord.setMissionCreateTime(createTime);
        this.missionRecordDAO.insert(missionRecord);
        int ret = missionRecord.getMissionId();
        correlationTest(ret);
        return ret;
    }

    void correlationTest(int missionId){
        carRecordDAO.insert(missionId);
        businessRecordDAO.insert(missionId);
    }
}
