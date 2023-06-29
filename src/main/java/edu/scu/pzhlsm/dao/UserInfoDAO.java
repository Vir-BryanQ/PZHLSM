package edu.scu.pzhlsm.dao;

import edu.scu.pzhlsm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoDAO {
    @Select("select * from UserInfo")
    public List<User> findAll();
}
