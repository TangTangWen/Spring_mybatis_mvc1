package cn.tang.controller;

import cn.tang.pojo.BbsDetail;
import cn.tang.pojo.BbsSort;
import cn.tang.pojo.Flower;
import cn.tang.pojo.Page;
import cn.tang.service.BbsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BbsDetailController {
    @Autowired
   private BbsDetailService bbsDetailService;
    @RequestMapping("/show")
    public String demol(@RequestParam(value = "sortId",defaultValue ="0") int sortId, Model model) {

        List<BbsSort> bbsSort=bbsDetailService.selById(sortId);

        model.addAttribute("bbsSort",bbsSort);
        return "bbs";
    }
}
