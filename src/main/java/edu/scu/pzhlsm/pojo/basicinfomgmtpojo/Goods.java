package edu.scu.pzhlsm.pojo.basicinfomgmtpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private int goodsId;
    private String goodsNumber;
    private String goodsType;
    private String goodsWeight;
    private String goodsQuantity;
    private int commodityId;

    public Goods(String goodsNumber, String goodsType, String goodsWeight, String goodsQuantity, int commodityId) {
        this.goodsNumber = goodsNumber;
        this.goodsType = goodsType;
        this.goodsWeight = goodsWeight;
        this.goodsQuantity = goodsQuantity;
        this.commodityId = commodityId;
    }
}
