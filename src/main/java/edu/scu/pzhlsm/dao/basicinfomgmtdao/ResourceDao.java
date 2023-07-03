package edu.scu.pzhlsm.dao.basicinfomgmtdao;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceDao {
    List<Resource> queryAllList();

    Resource queryById(@Param("resourceId") int id);

    int insertResource(Resource resource);

    int deleteResource(@Param("resourceId") int id);

    int updateResource(Resource resource);
}
