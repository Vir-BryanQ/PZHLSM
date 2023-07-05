package edu.scu.pzhlsm.controller.datastatisticanalysiscontroller;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.pojo.datastatisticanalysispojo.GetDate;
import edu.scu.pzhlsm.result.LinearResult;
import edu.scu.pzhlsm.service.datastatisticanalysisservice.LinearDataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LinearDataAnalysisController {
    @Autowired
    private LinearDataAnalysisService linearDataAnalysisService;

    @CrossOrigin
    @PostMapping("api/datastatisticanalysis/getlinear")
    public LinearResult getLinear(@RequestBody GetDate getDate){
        List<String> dates = convertDate(getDate.getDates());
        List<Integer> missionFinished = linearDataAnalysisService.monthMissionFinishedRecord(dates);
        List<Integer> carRepaired = linearDataAnalysisService.monthCarRepairRecord(dates);
        if(missionFinished==null && carRepaired == null){
            return new LinearResult(400, null, null, dates);
        } else if (missionFinished == null) {
            return new LinearResult(200, null, carRepaired, dates);
        } else if (carRepaired == null) {
            return new LinearResult(200, missionFinished, null, dates);
        }else {
            return new LinearResult(200, missionFinished, carRepaired, dates);
        }
    }

    List<String> convertDate(List<String> inDate){
        LocalDate beginTime = LocalDate.parse(inDate.get(0) + "-01");
        LocalDate endTime = LocalDate.parse(inDate.get(1) + "-01");
        int y1 = beginTime.getYear();
        int m1 = beginTime.getMonthValue();
        int y2 = endTime.getYear();
        int m2 = endTime.getMonthValue();
        int sum = 12 * (y2 - y1) + m2 - m1 + 1;
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < sum; i++){
            if(m1 < 10) ret.add(y1 + "-0" + m1);
            else ret.add(y1 + "-" + m1);
            m1++;
            if(m1 > 12) {
                m1 -= 12;
                y1 = y2;
            }
        }
        return ret;
    }
}
