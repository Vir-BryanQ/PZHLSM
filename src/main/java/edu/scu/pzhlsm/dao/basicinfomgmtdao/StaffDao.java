package edu.scu.pzhlsm.dao.basicinfomgmtdao;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaffDao {
    List<Staff> queryAllList();

    Staff queryById(@Param("staffId") int id);

    List<Staff> queryByCondition(@Param("staffName") String name,
                                 @Param("staffNumber") String number);

    int insertStaff(Staff staff);

    int deleteStaff(@Param("staffId") int id);

    int updateStaff(Staff staff);

}
