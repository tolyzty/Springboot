
package com.ace.controller;

import com.ace.pojo.User;
import com.ace.pojo.Users;
import com.ace.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/9/27.
 */

@Controller
public class UserController {
    static Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    UserService userService;



    @RequestMapping("/user")
    public String index(Model model){
        try {
            List<User> list = userService.findAll();
            model.addAttribute("msg",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "user";
    }

   /* @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/logins",method = RequestMethod.GET )
    public String logining(@RequestParam("username") String username, @RequestParam("password") String password, Model model,User user){
        String re = "success";
         try {
                boolean loginType = userService.login(user.getUserUsername(),user.getUserPassword());
                if (loginType){
                    model.addAttribute("message","成功");
                    return re;
                }else{
                    model.addAttribute("message","失败");
                    re = "error";
                    System.out.println("shibai ");
                    return "error";
                }

         }catch (Exception e){
             e.printStackTrace();
         }
         return re;
    }*/

    @RequestMapping(value="/{id}/edit")
    public String updataByid(@PathVariable("id") int id, Model model){
        try {
            User user = userService.selectById(id);
            user.getUserId();
            user.getUserUsername();
            user.getUserPassword();
            user.getUserPhone();
            user.getUserEmail();
            model.addAttribute("edit",user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "edit";
    }

    @RequestMapping(value = "/{id}/delete")
    public String deleteByid(@PathVariable("id") int id ,Model model){
        User user = new User();
        try {
            user.setUserId(id);
            user.setUserZt(1);
            this.userService.updateByKey(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/user";
    };


}
