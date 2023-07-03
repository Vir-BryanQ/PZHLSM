package edu.scu.pzhlsm.dao.purchaseandsalemgmtdao;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.CommodityPsi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommodityDao {
    List<CommodityPsi> queryAllList();

    CommodityPsi queryById(@Param("commodityId") int id);

    List<CommodityPsi> queryByCondition(@Param("commodityName") String name,
                                        @Param("commodityTime") String createtime);

    int insertCommodityPsi(CommodityPsi commodityPsi);

    int deleteCommodityPsi(@Param("commodityId") int id);

    int updateCommodityPsi(CommodityPsi commodityPsi);
}
