package cn.tang.service;

import cn.tang.pojo.Flower;

import java.util.List;
import java.util.Map;

public interface FlowerService {
    List<Flower> findAll();

    List<Flower> findByFlower(Map map);

    Long count(Map map);
}
