package edu.scu.pzhlsm.service.basicinfomgmtservice;

import edu.scu.pzhlsm.dao.basicinfomgmtdao.ResourceDao;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Resource;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourceDao resourceDao;

    public List<Resource> queryAll(){
        List<Resource> resourceList = resourceDao.queryAllList();
//        resourceList.forEach(resource -> {
//            System.out.println(resource);
//        });
        return resourceList;
    }

    public Resource querryById(int id){
        Resource resource = resourceDao.queryById(id);
//        System.out.println(resource);
        return resource;
    }

    public List<Resource> queryByCondition(String name){
        List<Resource> resourceList = resourceDao.queryByCondition(name);
        return resourceList;
    }

    public int insertResource(Resource resource){
        int result = resourceDao.insertResource(resource);
        return result;
    }

    public int deleteResource(int id){
        int result = resourceDao.deleteResource(id);
        return result;
    }

    public int updataResource(Resource resource){
        int result = resourceDao.updateResource(resource);
        return result;
    }
}
