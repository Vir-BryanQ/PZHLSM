package edu.scu.pzhlsm.dao.transscheduledao;


import edu.scu.pzhlsm.pojo.transschedulepojo.BusinessRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface BusinessRecordDAO {

    @Select("select * from commercial_customer_record")
    List<BusinessRecord> selectAll();

    @Select("select * from commercial_customer_record where mission_id = #{missionId}")
    BusinessRecord selectOne(int missionId);

    //后面改成map入参
    List<BusinessRecord> dynamicQuery(Map<String, Object> map);

/*    @Insert("insert into commercial_customer_record(mission_id, company_name, mission_price, state) " +
            "values (#{missionId}, #{companyName}, #{missionPrice}, #{state})")
    int insert(BusinessRecord businessRecord);*/

    @Insert("insert into commercial_customer_record(mission_id) values (#{missionId})")
    int insert(int missionId);

    int dynamicUpdate(BusinessRecord businessRecord);

    @Update("update commercial_customer_record set company_name = #{companyName}, mission_price = #{missionPrice}," +
            "state = #{state} WHERE mission_id = #{missionId}")
    int update(BusinessRecord businessRecord);
}
