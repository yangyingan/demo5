package com.demo.api;

import com.demo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
    @GetMapping("/test")
    public Result<Integer> hello(String id) {
        Result<Integer> rs=new Result<>();
        rs.setMsg(id);
        rs.setUserMsg(id);
        rs.setData(100);
        return rs;
    }
}
