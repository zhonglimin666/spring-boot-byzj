package com.example.controller;

import com.example.entity.AyUser;
import com.example.service.AyUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author dongshi
 */
@Controller
@Slf4j
public class LoginController {
    @Autowired
    private AyUserService ayUserService;

    /*@GetMapping("/tologin")
    public String tologin(){
        return "login";
    }*/
    @GetMapping("/login")
    public String login(String name, String password, HttpSession session){
        AyUser ayUser=ayUserService.findByNameAndPassword(name,password);
        if(null==ayUser){
            return "login";
        }
        session.setAttribute("user",ayUser);
        return "sucess";
    }
    @GetMapping("/success")
    public String success(){
        return "sucess";
    }
    @GetMapping("/toupdate")
    public String toupdate(){
        return "update";
    }
    @GetMapping("/update")
    @ResponseBody
    public String update(){
        return "修改成功!";
    }
}
