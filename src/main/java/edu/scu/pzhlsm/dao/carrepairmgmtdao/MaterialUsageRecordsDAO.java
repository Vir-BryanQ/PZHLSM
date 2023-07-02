package edu.scu.pzhlsm.dao.carrepairmgmtdao;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.MaterialUsageRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MaterialUsageRecordsDAO {
    @Insert("insert into material_usage_records " +
            "(record_id, material_id, department, user, usage_purpose, usage_quality) " +
            "values (#{recordId}, #{materialId}, #{department}, #{user}, #{usagePurpose}, #{usageQuality})")
    int saveMaterialUsageRecord(MaterialUsageRecord record);

    @Delete("delete from material_usage_records where record_id=#{recordId}")
    int deleteMaterialUsageRecord(MaterialUsageRecord record);

    @Update("update material_usage_records set " +
            "material_id = #{materialId}, department = #{department}, user = #{user}, " +
            "usage_purpose = #{usagePurpose}, usage_quality = #{usageQuality} " +
            "where record_id = #{recordId}")
    int updateMaterialUsageRecord(MaterialUsageRecord record);

    @Select("select * from material_usage_records")
    List<MaterialUsageRecord> findAll();
}
