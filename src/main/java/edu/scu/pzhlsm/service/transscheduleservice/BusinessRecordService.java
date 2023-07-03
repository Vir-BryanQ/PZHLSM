package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.dao.transscheduledao.BusinessRecordDAO;
import edu.scu.pzhlsm.pojo.transschedulepojo.BusinessRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BusinessRecordService {
    @Autowired
    private BusinessRecordDAO businessRecordDAO;

    public List<BusinessRecord> selectAll(){
        return this.businessRecordDAO.selectAll();
    }

    public BusinessRecord selectOne(int missionId){
        return this.businessRecordDAO.selectOne(missionId);
    }

    public int update(BusinessRecord businessRecord){
        return businessRecordDAO.update(businessRecord);
    }

    public List<BusinessRecord> dynamicQuery(JSON json){
/*        String jsonStr = json.toJSONString();
        Map<String, Object> map = JSON.parseObject(jsonStr, new TypeReference<>(){});*/
        Map<String, Object> map = JSON.parseObject(json.toString());
        return businessRecordDAO.dynamicQuery(map);
    }

    public int insert(BusinessRecord businessRecord){
        return businessRecordDAO.insert(businessRecord);
    }
}
