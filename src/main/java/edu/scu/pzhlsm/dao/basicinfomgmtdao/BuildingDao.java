package edu.scu.pzhlsm.dao.basicinfomgmtdao;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Building;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Vehicle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BuildingDao {
    List<Building> queryAllList();

    Building queryById(@Param("buildingId") int id);


    List<Building> queryByCondition(@Param("buildingName") String name);
    int insertBuilding(Building building);

    int deleteBuilding(@Param("buildingId") int id);

    int updateBuilding(Building building);
}
