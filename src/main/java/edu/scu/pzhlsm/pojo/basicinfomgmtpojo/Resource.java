package edu.scu.pzhlsm.pojo.basicinfomgmtpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    private int resourceId;
    private String resourceName;
    private String resourceUse;
    private int materialId;

    public Resource(String resourceName, String resourceUse, int materialId) {
        this.resourceName = resourceName;
        this.resourceUse = resourceUse;
        this.materialId = materialId;
    }
}
