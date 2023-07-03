package edu.scu.pzhlsm.dao.basicinfomgmtdao;

import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Goods;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsDao {
    List<Goods> queryAllList();

    Goods queryById(@Param("goodsId") int id);

    int insertGoods(Goods goods);

    int deleteGoods(@Param("goodsId") int id);

    int updateGoods(Goods goods);
}
