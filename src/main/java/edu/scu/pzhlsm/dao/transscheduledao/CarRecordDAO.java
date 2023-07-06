package edu.scu.pzhlsm.dao.transscheduledao;

import edu.scu.pzhlsm.pojo.transschedulepojo.CarRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface CarRecordDAO {

    @Select("select * from car_operate_record")
    List<CarRecord> selectAll();

    @Select("select * from car_operate_record where mission_id = #{missionId}")
    CarRecord selectOne(int missionId);

    List<CarRecord> dynamicQuery(Map<String, Object> map);

/*    int dynamicUpdate(CarRecord carRecord);*/

/*    @Insert("insert into car_operate_record(mission_id, car_id, car_type, car_licence, state, " +
            "mission_begin_time) values (#{missionId}, #{carId}, #{carType}, #{carLicence}, " +
            "#{state}, #{missionBeginTime})")
    int insert(CarRecord carRecord);*/

    @Insert("insert into car_operate_record(mission_id) values (#{missionId})")
    int insert(int missionId);

    @Update("UPDATE car_operate_record set car_id = #{carId}, car_type = #{carType}," +
            "car_licence = #{carLicence}, state = #{state}, mission_begin_time = #{missionBeginTime}" +
            " WHERE mission_id = #{missionId}")
    int update(CarRecord carRecord);
}
