package com.fifahistory.controllers;

import com.fifahistory.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mariano on 2/16/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public String init(){

        return "static/views/index";
    }


    @RequestMapping("/user/listAll")
    public @ResponseBody
    List<User> listAll(){

        List<User> usrList = new ArrayList<User>();

        User usr1 = new User();
        usr1.setNickname("Nanu");
        usr1.setUsername("mlois03");
        usr1.setPassword("boca2016");

        User usr2 = new User();
        usr2.setNickname("Martin");
        usr2.setUsername("mzero00");
        usr2.setPassword("pwd123");

        usrList.add(usr1);
        usrList.add(usr2);

        return usrList;
    }

}
