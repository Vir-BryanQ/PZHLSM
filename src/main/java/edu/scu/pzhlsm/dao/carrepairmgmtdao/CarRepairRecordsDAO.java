package edu.scu.pzhlsm.dao.carrepairmgmtdao;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.CarRepairRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CarRepairRecordsDAO {
    @Insert("insert into car_repair_records " +
            "(record_id, car_id, repair_date, repair_type, repair_description, repair_cost) " +
            "values (#{recordId}, #{carId}, #{repairDate}, #{repairType}, #{repairDescription}, #{repairCost})")
    int saveCarRepairRecord(CarRepairRecord record);

    @Delete("delete from car_repair_records where record_id=#{recordId}")
    int deleteCarRepairRecord(CarRepairRecord record);

    @Update("update car_repair_records set " +
            "car_id = #{carId}, repair_date = #{repairDate}, repair_type = #{repairType}, " +
            "repair_description = #{repairDescription}, repair_cost = #{repairCost} " +
            "where record_id = #{recordId}")
    int updateCarRepairRecord(CarRepairRecord record);

    @Select("select * from car_repair_records")
    List<CarRepairRecord> findAll();
}
