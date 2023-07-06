package edu.scu.pzhlsm.dao.purchaseandsalemgmtdao;

import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.VehiclePsi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VehiclepsiDao {
    List<VehiclePsi> queryAllList();

    VehiclePsi queryById(@Param("vehicleId") int id);

    List<VehiclePsi> queryByCondition(@Param("vehicleName") String name,
                                      @Param("vehicleTime") String time);

    int insertVehiclePsi(VehiclePsi vehiclePsi);

    int deleteVehiclePsi(@Param("vehicleId") int id);

    int updateVehiclePsi(VehiclePsi vehiclePsi);
}
