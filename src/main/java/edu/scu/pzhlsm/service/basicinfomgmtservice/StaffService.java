package edu.scu.pzhlsm.service.basicinfomgmtservice;

import edu.scu.pzhlsm.dao.basicinfomgmtdao.StaffDao;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    StaffDao staffDao;

    public List<Staff> queryAll(){
        List<Staff> staffList = staffDao.queryAllList();
//        staffList.forEach(staff -> {
//            System.out.println(staff);
//        });
        return staffList;
    }

    public Staff querryById(int id){
        Staff staff = staffDao.queryById(id);
//        System.out.println(staff);
        return staff;
    }

    public int insertStaff(Staff staff){
        int result = staffDao.insertStaff(staff);
        return result;
    }

    public int deleteStaff(int id){
        int result = staffDao.deleteStaff(id);
        return result;
    }

    public int updataStaff(Staff staff){
        int result = staffDao.updateStaff(staff);
        return result;
    }
}
