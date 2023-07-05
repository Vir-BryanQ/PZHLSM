package edu.scu.pzhlsm.result;

import java.util.Arrays;
import java.util.List;

public class ReturnResult {
    int status;
    List<String> zones;
    List<Integer> nums;

    public ReturnResult(int state,     List<Integer> num) {
        this.zones = Arrays.stream(new String[]{"锦江区", "青羊区", "金牛区", "武侯区", "成华区", "龙泉驿区",
                "新都区", "郫都区", "温江区", "双流区", "青白江区", "新津区"}).toList();
        this.nums = num;
        this.status = state;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getZones() {
        return zones;
    }

    public void setZones(List<String> zones) {
        this.zones = zones;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "ReturnResult{" +
                "status=" + status +
                ", zones=" + zones +
                ", nums=" + nums +
                '}';
    }
}
