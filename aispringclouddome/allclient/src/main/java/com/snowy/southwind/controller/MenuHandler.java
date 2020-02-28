package com.snowy.southwind.controller;

import com.snowy.southwind.bean.Menu;
import com.snowy.southwind.bean.AllVO;
import com.snowy.southwind.bean.Msg;
import com.snowy.southwind.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @auther snowy
 * @date 2020/1/19 - 23:11
 */
@Controller
@RequestMapping("/menu")
public class MenuHandler {
    @Autowired
    private MenuFeign menuFeign;

    /*查询所有菜品数据*/
    @GetMapping("/findAll")
    @ResponseBody
    public AllVO findAll(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit){
        Integer index = (page-1)*limit;
        return new AllVO(0,"",menuFeign.count(),menuFeign.findAll(index, limit));
    }

    /*删除meno某个菜品*/
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        menuFeign.deleteById(id);
        return "redirect:/menu_manage.html";
    }

    /*查询当个菜品信息*/
    @GetMapping("/findById/{id}")
    @ResponseBody
    public Msg findById(@PathVariable("id")Integer id){
        return  Msg.success().add("oneMenu",menuFeign.findById(id));
    }

    /*查询所有菜品类型*/
    @GetMapping("/typeFindAll")
    @ResponseBody
    public Msg TfindById(){
        return Msg.success().add("types",menuFeign.TfindById());
    };

    /*修改菜品*/
    @PutMapping("/update/{id}")
    @ResponseBody
    public Msg update(@PathVariable("id")long id,Menu menu){
            menuFeign.Mupdate(id,menu);
            return Msg.success();
    }

    //添加菜品
    @PostMapping("/save")
    public String save(Menu menu){
        menuFeign.save(menu);
        return "redirect:/menu_manage.html";
    }

}
