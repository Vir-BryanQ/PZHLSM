package edu.scu.pzhlsm.service.basicinfomgmtservice;

import edu.scu.pzhlsm.dao.basicinfomgmtdao.StaffDao;
import edu.scu.pzhlsm.dao.basicinfomgmtdao.VehicleDao;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    VehicleDao vehicleDao;

    public List<Vehicle> queryAll(){
        List<Vehicle> vehicleList = vehicleDao.queryAllList();
//        vehicleList.forEach(staff -> {
//            System.out.println(staff);
//        });
        return vehicleList;
    }

    public Vehicle querryById(int id){
        Vehicle vehicle = vehicleDao.queryById(id);
//        System.out.println(vehicle);
        return vehicle;
    }

    public int insertVehicle(Vehicle vehicle){
        int result = vehicleDao.insertVehicle(vehicle);
        return result;
    }

    public int deleteVehicle(int id){
        int result = vehicleDao.deleteVehicle(id);
        return result;
    }

    public int updataVehicle(Vehicle vehicle){
        int result = vehicleDao.updateVehicle(vehicle);
        return result;
    }
}
