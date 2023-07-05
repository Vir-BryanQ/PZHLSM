package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.dao.purchaseandsalemgmtdao.OfficeConsumableDao;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.OfficeConsumable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeConsumableService {
    @Autowired
    private OfficeConsumableDao officeConsumableDao;

    //查询所有办公耗材采购信息
    public List<OfficeConsumable> queryAll(){
        List<OfficeConsumable> officeConsumables = officeConsumableDao.queryOfficeConsumables();
//        officeConsumables.forEach(officeConsumable -> {
//            System.out.println(officeConsumable);
//        });
        return officeConsumables;
    }

    //通过Id查询办公耗材采购信息
    public OfficeConsumable queryById(int consumableId){
        OfficeConsumable officeConsumable = officeConsumableDao.queryById(consumableId);
//        System.out.println(officeConsumable);
        return officeConsumable;
    }

    //新增办公耗材采购信息
    public int addConsumable(OfficeConsumable officeConsumable){
        int result = officeConsumableDao.insertConsumable(officeConsumable);
//        System.out.println(officeConsumable);
        return result;
    }

    //删除办公耗材采购信息
    public int deleteConsumable(int id){
        int result = officeConsumableDao.deleteConsumable(id);
        return result;
    }

    //修改办公耗材采购信息
    public int reviseConsumable(OfficeConsumable officeConsumable){
        int result = officeConsumableDao.updateConsumable(officeConsumable);
        return result;
    }
}
