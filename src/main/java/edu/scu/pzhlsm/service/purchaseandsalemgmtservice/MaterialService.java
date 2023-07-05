package edu.scu.pzhlsm.service.purchaseandsalemgmtservice;

import edu.scu.pzhlsm.dao.purchaseandsalemgmtdao.MaterialDao;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.MaterialPsi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    private MaterialDao materialDao;

    public List<MaterialPsi> queryAll(){
        List<MaterialPsi> materialPsiList = materialDao.queryAllList();
//        materialPsiList.forEach(materialPsi -> {
//            System.out.println(materialPsi);
//        });
        return materialPsiList;
    }

    public MaterialPsi queryById(int id){
        MaterialPsi materialPsi = materialDao.queryById(id);
//        System.out.println(materialPsi);
        return materialPsi;
    }

    public int addMaterialPsi(MaterialPsi materialPsi){
        int result = materialDao.insertMaterialPsi(materialPsi);
        return result;
    }

    public int deleteMaterialPsi(int id){
        int result = materialDao.deleteMaterialPsi(id);
        return result;
    }

    public int reviseMaterialPsi(MaterialPsi materialPsi){
        int result = materialDao.updateMaterialPsi(materialPsi);
        return result;
    }

}
