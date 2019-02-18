package cn.tang.mapper;

import cn.tang.pojo.BbsSort;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BbsSortMapper {
    List<BbsSort> selAllById(@Param("id") int id);
}
