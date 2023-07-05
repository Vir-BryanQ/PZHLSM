package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.dao.purchaseandsalemgmtdao.VehiclepsiDao;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.VehiclePsi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclepsiService {
    @Autowired
    private VehiclepsiDao vehiclepsiDao;

    public List<VehiclePsi> queryAll(){
        List<VehiclePsi> vehiclePsiList = vehiclepsiDao.queryAllList();
//        vehiclePsiList.forEach(vehiclePsi -> {
//            System.out.println(vehiclePsi);
//        });
        return vehiclePsiList;
    }

    public VehiclePsi queryById(int id){
        VehiclePsi vehiclePsi = vehiclepsiDao.queryById(id);
//        System.out.println(vehiclePsi);
        return vehiclePsi;
    }

    public int addVehiclePsi(VehiclePsi vehiclePsi){
        int result = vehiclepsiDao.insertVehiclePsi(vehiclePsi);
        return result;
    }

    public int deleteVehiclePsi(int id){
        int result = vehiclepsiDao.deleteVehiclePsi(id);
        return result;
    }

    public int reviseVehiclePsi(VehiclePsi vehiclePsi){
        int result = vehiclepsiDao.updateVehiclePsi(vehiclePsi);
        return result;
    }
}
