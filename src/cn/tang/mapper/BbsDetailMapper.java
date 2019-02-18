package cn.tang.mapper;

import cn.tang.pojo.BbsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BbsDetailMapper {
    //根据名称查询
    List<BbsDetail> selectById(@Param("id") int id);
    //新增详细
    void add(BbsDetail bbsDetail);

    List<BbsDetail> selById(@Param("id") int id);
}
