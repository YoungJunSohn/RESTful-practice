package com.example.restfulapi.web.helloworld;

import com.example.restfulapi.web.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //get, /hello-world(end point)
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "hello-world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello world");
    }//java Bean 형태로 반환하게 되면, Springframework에서는 이 값을 text나 object로 보지 않고, json형태로 parsing해서 반환하게 된다.
    //java의 컬렉션, String, 배열 등등의 자바 기반의 다른 객체 형태로 반환하더라도 json형태로 parsing이 된다는 점 !

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Welcome %s, good morning", name));
    }
}
