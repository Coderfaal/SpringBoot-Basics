package com.tcs.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/testing")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String nameSakeMethod(){
        return "Hello";  //we are returing the view THAT IS THE name of my html file from the template floder
    }


}
