package cn.tang.service;

import cn.tang.mapper.BbsDetailMapper;
import cn.tang.mapper.BbsSortMapper;
import cn.tang.pojo.BbsDetail;
import cn.tang.pojo.BbsSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class IBbsDetailService  implements  BbsDetailService{
    @Autowired
    private BbsSortMapper bbsSortMapper;

    @Override
    public List<BbsSort> selById(int id) {
        return bbsSortMapper.selAllById(id);
    }
}
