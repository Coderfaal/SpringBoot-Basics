package com.tcs.springboot;

import com.tcs.springboot.controller.User;
import com.tcs.springboot.controller.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/signup")
public class RegristrationController {
@Autowired
    UserRepository repository;
    @GetMapping("/signup")
    public String method() {
        return "registration";
    }

    @PostMapping(value = "/register")
    //using objects
    public String registerUser(@ModelAttribute User u, Model m){

        if(u.getUserName().length()>=8
                &&  u.getPassword().length()>=8)
        {
                 User newUser = repository.save(u);
                          m.addAttribute("uid",u.getUserId());
                          m.addAttribute("uname",u.getUserName());
                          m.addAttribute("password",u.getPassword());

                          m.addAttribute("user",newUser);
            return "success";
        }
        else
        {
            return "registration";
        }
    }
}




//    @PostMapping(value = "/register")
//    public String registerUser(@RequestParam String userName ,
//                               @RequestParam String password){
//
//        if(userName.length()>=8 &&  password.length()>=8){
//            return "success";
//        }else {
//            return "registration";
//        }
//    }
//} //
