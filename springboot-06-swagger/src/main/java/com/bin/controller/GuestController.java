package com.bin.controller;

import com.bin.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 业务控制类 返回视图
 *
 * @RequestMapping("/guest")
 * 放在类上面，代表类里面的方法是以此开头的
 * @Api 声明一系列接口的功能 放在controller
 */
@RestController
@RequestMapping("/guest")
@Api(tags = "嘉宾相关的接口",description = "对嘉宾进行增删改查的接口")
public class GuestController {
    /**
     * @ApiOperation("查询嘉宾的列表")
     * 声明具体接口的功能  放在controller的方法之上
     * @return
     */
    @GetMapping
    @ApiOperation("查询嘉宾的列表")
    public String list(){
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping()
    @ApiOperation("增加嘉宾接口")
    public String add(Guest guest){
        return "add guest";
    }

    /**
     * 通过/guest/toUpdate/{name}格式的url映射到此方法
     * 其中的那么属性值 通过注解@PathVariable("name")映射到方法属性中
     * 其中的name代表去url中获取url中查找的属性值
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        return "update";
    }
    @ApiOperation("更新嘉宾的接口")
    @PutMapping()
    public String update(Guest guest){

        return "update guest";
    }
    @ApiOperation("删除嘉宾的接口")
    @ApiImplicitParam(name="name",value = "姓名")
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        return "delete guest ";
    }

}
