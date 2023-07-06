package edu.scu.pzhlsm.dao.purchaseandsalemgmtdao;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.MaterialPsi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MaterialDao {

    List<MaterialPsi> queryAllList();

    MaterialPsi queryById(@Param("materialId") int id);

    List<MaterialPsi> queryByCondition(@Param("materialName") String name,
                                       @Param("materialTime") String time);

    int insertMaterialPsi(MaterialPsi materialPsi);

    int deleteMaterialPsi(@Param("materialId") int id);

    int updateMaterialPsi(MaterialPsi materialPsi);

}
