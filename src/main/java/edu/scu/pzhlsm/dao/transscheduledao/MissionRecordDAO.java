package edu.scu.pzhlsm.dao.transscheduledao;

import edu.scu.pzhlsm.pojo.transschedulepojo.MissionRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface MissionRecordDAO {

    @Select("select * from transportation_mission_record")
    List<MissionRecord> selectAll();

    @Select("select * from transportation_mission_record where mission_id = #{missionId}")
    MissionRecord selectOne(int missionId);

    List<MissionRecord> dynamicQuery(Map<String, Object> map);

    int dynamicUpdate(MissionRecord missionRecord);

    int insert(MissionRecord missionRecord);

    @Update("UPDATE transportation_mission_record set mission_create_time = #{missionCreateTime}," +
            "mission_finish_time = #{missionFinishTime}, mission_origin = #{missionOrigin}," +
            "mission_destination = #{missionDestination}, state = #{state} WHERE mission_id =#{missionId}")
    int update(MissionRecord missionRecord);
}
