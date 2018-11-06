package com.ly.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/page")
    public String page(){
    	//@RestController combines @Controller and @ResponseBody
    	//测试url http://localhost:8080/boot-mvc/json
        return "index.jsp";
    }
}