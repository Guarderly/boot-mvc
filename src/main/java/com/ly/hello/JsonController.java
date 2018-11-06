package com.ly.hello;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @RequestMapping("/json")
    public String index(){
    	//@RestController combines @Controller and @ResponseBody
    	//测试url http://localhost:8080/boot-mvc/json
        return "gg";
    }
}