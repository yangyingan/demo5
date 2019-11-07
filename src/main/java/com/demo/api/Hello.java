package com.demo.api;

import com.demo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController=@Controller+@ResponseBody
//@Controller
@RestController
@RequestMapping("api/hello")
public class Hello {

    //@ResponseBody
    //@RequestMapping("/test1")
    //@PostMapping("/test1")
    @GetMapping("/test1")
    //@RequestMapping(value="/test1",method=RequestMethod.POST)
    public Result<Integer> hello(@RequestBody  Param param) {
        Result<Integer> rs=new Result<>();
        rs.setMsg(param.getName());
        rs.setUserMsg(param.getDept().getDeptName());
        rs.setData(100);
        return rs;
    }
}
