package cn.tang.controller;

import cn.tang.pojo.Flower;
import cn.tang.pojo.Page;
import cn.tang.service.FlowerService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FlowerController  {
    @Autowired
    FlowerService flowerService;
    @RequestMapping("/demol")
    public String demol(@RequestParam(value = "pageSize",defaultValue ="2") int pageSzie,@RequestParam(value = "pageNumber",defaultValue ="1") int pageNumber,Model model,String name,String production) {
        Map<String,Object> map=new HashMap<>();
        map.put("start",(pageNumber-1)*pageSzie);
        map.put("pageSize",pageSzie);
        map.put("name",name);
        map.put("production",production);
        List<Flower> list=flowerService.findByFlower(map);
        Long count=flowerService.count(map);
        Long total=count%pageSzie==0?count/pageSzie:count/pageSzie+1;
        Page pages =new Page(pageSzie,pageNumber,list,total);
        model.addAttribute("page",pages);
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/showDemol")
    public List<Flower> show() {
        return flowerService.findAll();
    }
}
