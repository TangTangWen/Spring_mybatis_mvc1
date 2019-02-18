package cn.tang.service;

import cn.tang.pojo.BbsDetail;
import cn.tang.pojo.BbsSort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BbsDetailService {
//    //根据名称查询
//    List<BbsDetail> show(int id);
//    //新增详细
//    void add(BbsDetail bbsDetail);
    List<BbsSort> selById(int id);
}
