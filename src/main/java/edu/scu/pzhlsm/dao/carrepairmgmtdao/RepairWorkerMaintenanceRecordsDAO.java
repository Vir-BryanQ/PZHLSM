package edu.scu.pzhlsm.dao.carrepairmgmtdao;

import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.RepairWorkerMaintenanceRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RepairWorkerMaintenanceRecordsDAO {
    @Insert("insert into repair_worker_maintenance_records " +
            "(record_id, repair_worker_id, car_id, maintenance_date, maintenance_description, maintenance_cost) " +
            "values (#{recordId}, #{repairWorkerId}, #{carId}, #{maintenanceDate}, #{maintenanceDescription}, #{maintenanceCost})")
    int saveRepairWorkerMaintenanceRecord(RepairWorkerMaintenanceRecord record);

    @Delete("delete from repair_worker_maintenance_records where record_id=#{recordId}")
    int deleteRepairWorkerMaintenanceRecord(RepairWorkerMaintenanceRecord record);

    @Update("update repair_worker_maintenance_records set " +
            "repair_worker_id = #{repairWorkerId}, car_id = #{carId}, maintenance_date = #{maintenanceDate}, " +
            "maintenance_description = #{maintenanceDescription}, maintenance_cost = #{maintenanceCost} " +
            "where record_id = #{recordId}")
    int updateRepairWorkerMaintenanceRecord(RepairWorkerMaintenanceRecord record);

    @Select("select * from repair_worker_maintenance_records")
    List<RepairWorkerMaintenanceRecord> findAll();
}
