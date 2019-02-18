package cn.tang.mapper;

import cn.tang.pojo.Flower;

import java.util.List;
import java.util.Map;

public interface FlowerMapper {
    List<Flower> selAll();

    List<Flower> selByFlower(Map map);

    Long count(Map map);
}
