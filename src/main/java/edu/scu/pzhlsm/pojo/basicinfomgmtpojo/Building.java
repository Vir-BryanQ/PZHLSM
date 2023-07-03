package edu.scu.pzhlsm.pojo.basicinfomgmtpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Building {
    private int buildingId;
    private String buildingName;
    private String buildingPlace;
    private String buildingArea;
    private String createTime;
    private String updateTime;

    public Building(String buildingName, String buildingPlace, String buildingArea, String createTime, String updateTime) {
        this.buildingName = buildingName;
        this.buildingPlace = buildingPlace;
        this.buildingArea = buildingArea;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
