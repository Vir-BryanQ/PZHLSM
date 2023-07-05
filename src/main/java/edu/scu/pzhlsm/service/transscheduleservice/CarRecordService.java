package edu.scu.pzhlsm.service.transscheduleservice;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.dao.transscheduledao.CarRecordDAO;
import edu.scu.pzhlsm.pojo.transschedulepojo.CarRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CarRecordService {
    @Autowired
    private CarRecordDAO carRecordDAO;

    public List<CarRecord> selectAll(){
        return carRecordDAO.selectAll();
    }

    public CarRecord selectOne(int missionId){
        return carRecordDAO.selectOne(missionId);
    }

    public int update(CarRecord carRecord){
        return carRecordDAO.update(carRecord);
    }

    public List<CarRecord> dynamicQuery(Map<String, Object> map){
        //Map<String, Object> map = JSON.parseObject(json.toString());
        //System.out.println(map);
        return carRecordDAO.dynamicQuery(map);
    }

/*    public int insert(CarRecord carRecord){
        return carRecordDAO.insert(carRecord);
    }*/
}
