package edu.scu.pzhlsm.service.basicinfomgmtservice;

import edu.scu.pzhlsm.dao.basicinfomgmtdao.BuildingDao;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Building;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {
    @Autowired
    BuildingDao buildingDao;

    public List<Building> queryAll(){
        List<Building> buildings = buildingDao.queryAllList();
        buildings.forEach(building -> {
            System.out.println(building);
        });
        return buildings;
    }

    public Building querryById(int id){
        Building building = buildingDao.queryById(id);
        System.out.println(building);
        return building;
    }

    public int insertBuilding(Building building){
        int result = buildingDao.insertBuilding(building);
        return result;
    }

    public int deleteBuilding(int id){
        int result = buildingDao.deleteBuilding(id);
        return result;
    }

    public int updataBuilding(Building building){
        int result = buildingDao.updateBuilding(building);
        return result;
    }
}
