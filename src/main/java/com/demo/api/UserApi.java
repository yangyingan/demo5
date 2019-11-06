package com.demo.api;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.Result;
import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/api/user")
public class UserApi {
    @Resource
    private IUserService userService;

    @RequestMapping("list")
    public Result<User> list(){
        User user = userService.getById(3);
        Result<User> rs=new Result<>();
        rs.setMsg("请求成功");
        rs.setUserMsg("请求成功");
        rs.setData(user);
        return rs;
    }

    @RequestMapping("add")
    public Result<Boolean> add(User user){
        boolean flag = userService.save(user);
        Result<Boolean> rs=new Result<>();
        rs.setMsg("请求成功");
        rs.setUserMsg("请求成功");
        rs.setData(flag);
        return rs;
    }

    @RequestMapping("update")
    public Result<Boolean> update(User user){
        boolean b = userService.updateById(user);
        Result<Boolean> rs=new Result<>();
        rs.setMsg("请求成功");
        rs.setUserMsg("请求成功");
        rs.setData(b);
        return rs;
    }

    @RequestMapping("page")
    public Result<IPage<User>> page(){
        Page<User> page=new Page();
        page.setSize(10);
        page.setCurrent(1);
        //导包:alt+回车
        QueryWrapper<User> wrapper=new QueryWrapper<User>();
        wrapper.like(User.NAME,"6");

        //自动生成接收参数变量：ctrl+alt+v
        IPage<User> page1 = userService.page(page, wrapper);

        Result<IPage<User>> rs=new Result<>();
        rs.setMsg("请求成功");
        rs.setUserMsg("请求成功");
        rs.setData(page1);
        return rs;
    }
}
