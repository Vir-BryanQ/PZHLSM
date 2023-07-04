package edu.scu.pzhlsm.dao.transscheduledao;

import edu.scu.pzhlsm.pojo.transschedulepojo.RailwayMissionRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface RailwayMissionRecordDAO {
    @Select("select * from railway_mission_record")
    List<RailwayMissionRecord> selectAll();

    @Select("select * from railway_mission_record where mission_id = #{id}")
    RailwayMissionRecord selectOne(int missionId);

    List<RailwayMissionRecord> dynamicQuery(Map<String, Object> map);

    int insert(RailwayMissionRecord railwayMissionRecord);

    @Update("UPDATE railway_mission_record set mission_begin_time = #{missionBeginTime}," +
            "mission_finish_time = #{missionFinishTime}, mission_origin = #{missionOrigin}," +
            "mission_destination = #{missionDestination}, state = #{state}, company_name = #{companyName}," +
            "mission_price = #{missionPrice}, train_id = #{trainId} WHERE mission_id =#{missionId}")
    int update(RailwayMissionRecord railwayMissionRecord);
}
