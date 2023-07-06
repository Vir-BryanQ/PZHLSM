package edu.scu.pzhlsm.dao.basicinfomgmtdao;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Vehicle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VehicleDao {
    List<Vehicle> queryAllList();

    Vehicle queryById(@Param("vehicleId") int id);

    List<Vehicle> queryByCondition(String number);

    int insertVehicle(Vehicle vehicle);

    int deleteVehicle(@Param("vehicleId") int id);

    int updateVehicle(Vehicle vehicle);
}
