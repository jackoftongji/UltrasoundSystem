package com.controller;

import com.pojo.Ultrasound;
import com.service.UltrasoundService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/ultrasound")
public class UltrasoundController {
    @Autowired
    private UltrasoundService ultrasoundService;
    //查询数据
    @RequestMapping("/allUltrasound")
    public String list(Model model){
        List<Ultrasound> list = ultrasoundService.queryAllUltrasound();
        model.addAttribute("list", list);
        return "allUltrasound";
    }

    //拦截安卓发来的数据并写入数据库
    @RequestMapping(value="/ultrasound01", method=RequestMethod.POST)  //去掉, method=RequestMethod.POST后，可同时接受post和get请求
    @ResponseBody  // 返回json格式的响应
    public String sendUltrasound(@RequestBody String model) {
        JSONObject jsonObject = JSONObject.fromObject(model);
        Ultrasound ultrasound = (Ultrasound)JSONObject.toBean(jsonObject,Ultrasound.class);
        //System.out.println(ultrasound.toString());
        ultrasoundService.addUltrasound(ultrasound);
        return "Get request is successful." ;
    }
    //调用数据给安卓
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Ultrasound getById(@PathVariable long id){
        Ultrasound ultrasound = ultrasoundService.queryById(id);
        //System.out.println(ultrasound.toString());
        return ultrasound;
    }

    //往数据库添加数据
    @RequestMapping("/toAddUltrasound")
    public String toAddUltrasound(){
        return "addUltrasound";
}

    @RequestMapping("/addUltrasound")
    public String addUltrasound(Ultrasound ultrasound){
        ultrasoundService.addUltrasound(ultrasound);
        return "redirect:/ultrasound/allUltrasound";
}
    //删除数据
    @RequestMapping("/del/{uId}")
    public String deleteUltrasound(@PathVariable("uId") Long id){
        ultrasoundService.deleteUltrasoundById(id);
        return "redirect:/ultrasound/allUltrasound";
    }

}
