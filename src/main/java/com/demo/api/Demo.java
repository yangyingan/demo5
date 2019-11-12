package com.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    public static void main(String[] args) {
        System.out.println("main");
    }

    public static void test1(){
        System.out.println("yya/demo6分支增加的内容");
    }

    public static void test2(){
        System.out.println("yya/demo5分支增加的内容");
    }

    public static void test3(){
        System.out.println("yya/master分支增加的内容");
    }

    public static void test4(){
        System.out.println("master增加的内容");
    }

    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
}
