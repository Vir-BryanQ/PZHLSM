package edu.scu.pzhlsm.controller.datastatisticanalysiscontroller;

import com.alibaba.fastjson.JSON;
import edu.scu.pzhlsm.pojo.datastatisticanalysispojo.GetDate;
import edu.scu.pzhlsm.result.ReturnResult;
import edu.scu.pzhlsm.service.datastatisticanalysisservice.ExportBusinessDistributedStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/datastatisticanalysis")
public class datastatisticanalysiscontroller {
    @Autowired
    ExportBusinessDistributedStatsService EBDSService;

    List<String> convertDate(JSON json){
        Map<String, Object> inMap = JSON.parseObject(json.toString());
        List<String> inDate = (List<String>) inMap.get("dates");
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

/*    @CrossOrigin
    @PostMapping("/exportBusinessDistributedStats")
    @ResponseBody
    Map<String, Object> exportBusinessDistributedStats(@RequestParam("year") String year){
        return this.EBDSService.export(year);
    }*/


    @CrossOrigin
    @PostMapping("/exportBusinessDistributedStats")
    @ResponseBody
    ReturnResult exportBusinessDistributedStats(@RequestBody Map<String, String> map){
        System.out.println(map);
        String year = map.get("dates");
        System.out.println(this.EBDSService.export(year));
        List<Integer> num =  new ArrayList<>(this.EBDSService.export(year));
        System.out.println(num);
        ReturnResult result = new ReturnResult(200, num);
        System.out.println(result);
        return result;
    }
}
