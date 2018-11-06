package com.ly.hello;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }

    @RequestMapping("/hello")
    public String index(){
    	//@RestController combines @Controller and @ResponseBody
    	//测试url http://localhost:8080/boot-mvc/hello
        return "Hello Spring Boot!";
    }
}