package edu.scu.pzhlsm.dao.purchaseandsalemgmtdao;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.BuildingTransactionRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BuildingTransactionRecordsDAO {

    @Insert("insert into building_transaction_records " +
            "(record_id, building_id, transaction_type, tenant_buyer_name, transaction_date, transaction_price, lease_term) " +
            "values (#{recordId}, #{buildingId}, #{transactionType}, #{tenantBuyerName}, #{transactionDate}, #{transactionPrice}, #{leaseTerm})")
    int saveBuildingTransactionRecord(BuildingTransactionRecord record);

    @Delete("delete from building_transaction_records where record_id=#{recordId}")
    int deleteBuildingTransactionRecord(BuildingTransactionRecord record);

    @Update("update building_transaction_records set " +
            "building_id = #{buildingId}, transaction_type = #{transactionType}, tenant_buyer_name = #{tenantBuyerName}, " +
            "transaction_date = #{transactionDate}, transaction_price = #{transactionPrice}, lease_term = #{leaseTerm} " +
            "where record_id = #{recordId}")
    int updateBuildingTransactionRecord(BuildingTransactionRecord record);

    @Select("select * from building_transaction_records")
    List<BuildingTransactionRecord> findAll();
}
