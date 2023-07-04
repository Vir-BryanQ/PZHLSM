package edu.scu.pzhlsm.controller.datastatisticanalysiscontroller;

import edu.scu.pzhlsm.pojo.datastatisticanalysispojo.GetProfitRequest;
import edu.scu.pzhlsm.result.ProfitResult;
import edu.scu.pzhlsm.service.datastatisticanalysisservice.OutputValueProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OutputValueProfitController {
    @Autowired
    private OutputValueProfitService outputValueProfitService;

    @CrossOrigin
    @PostMapping(value = "api/datastatisticanalysis/getprofit")
    @ResponseBody
    public ProfitResult doGetProfit(@RequestBody GetProfitRequest request) {
        List<String> requestDates = request.getDates();
        List<String> dates = convertDate(requestDates);
        List<Double> profit = outputValueProfitService.getOutputValueProfitByDates(dates);

        if (profit == null) {
            return new ProfitResult(400, null, null);
        } else {
            return new ProfitResult(200, profit, dates);
        }
    }

    public List<String> convertDate(List<String> inDate){
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
                y1++;
            }
        }
        return ret;
    }
}
