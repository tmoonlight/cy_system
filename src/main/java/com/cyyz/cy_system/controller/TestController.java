package com.cyyz.cy_system.controller;
import com.cyyz.cy_system.common.mapper.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: SHZ
 * @Description:
 * @Date: Created in 2018-03-22 10:36
 * alt+f8格式化代码
 */

@RestController
@RequestMapping(value = "/test", produces = "application/json;charset=UTF-8")
public class TestController  {

    @Autowired
    private TestRepo testRepo;


    @GetMapping("/str")
    public String TestString(String teststr) {
        //调用mybatis

        int x = testRepo.CGetAllList().get(0).getID();

        return  String.valueOf(x);
    }

    private String test(String str) {

        return "test";
    }
}
