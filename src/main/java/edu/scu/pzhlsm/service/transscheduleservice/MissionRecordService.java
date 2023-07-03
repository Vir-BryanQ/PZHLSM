package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSON;
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

    public int insert(MissionRecord missionRecord){
        LocalDate localDate = LocalDate.now();
/*        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");*/
        String createTime = localDate.toString();
        missionRecord.setMissionCreateTime(createTime);
/*        System.out.println(missionRecord);*/
        this.missionRecordDAO.insert(missionRecord);
        return missionRecord.getMissionId();
    }
}
