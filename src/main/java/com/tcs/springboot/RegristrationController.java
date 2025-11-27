package com.tcs.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/signup")
public class RegristrationController {

    @GetMapping("/signup")
    public String method(){
        return "registration";
    }

    @PostMapping(value = "/register")
    public String registerUser(@RequestParam String userName ,
                               @RequestParam String password){

        if(userName.length()>=8 &&  password.length()>=8){
            return "success";
        }else {
            return "registration";
        }
    }
}
