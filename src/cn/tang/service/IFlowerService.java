package cn.tang.service;

import cn.tang.mapper.FlowerMapper;
import cn.tang.pojo.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class IFlowerService implements FlowerService {
    @Autowired
    private FlowerMapper flowerMapper;

    @Override
    public List<Flower> findAll() {
        return flowerMapper.selAll();
    }
    @Override
    public List<Flower> findByFlower(Map map) {
        return flowerMapper.selByFlower(map);
    }

    @Override
    public Long count(Map map) {
        return flowerMapper.count(map);
    }

}
