package com.example.springbootproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody public String hello() {
        return "Hello 新华学院！！！";
    }

}
