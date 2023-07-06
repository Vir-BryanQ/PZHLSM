package edu.scu.pzhlsm.dao.purchaseandsalemgmtdao;


import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.OfficeConsumable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OfficeConsumableDao {
    List<OfficeConsumable> queryOfficeConsumables();

    OfficeConsumable queryById(@Param("consumableId") int id);

    List<OfficeConsumable> queryByCondition(@Param("consumableName") String name,
                                            @Param("consumableTime") String time);

    int insertConsumable(OfficeConsumable officeConsumable);

    int deleteConsumable(@Param("consumableId") int id);

    int updateConsumable(OfficeConsumable officeConsumable);
}
