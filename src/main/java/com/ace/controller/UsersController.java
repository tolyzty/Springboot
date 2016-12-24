package com.ace.controller;

import com.ace.pojo.Users;
import com.ace.service.UsersService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016/12/17.
 */
@Controller
public class UsersController {
    static Logger logger = Logger.getLogger(UsersController.class.getName());
    @Autowired
    UsersService usersService;




    @RequestMapping("/")
    public String syhome(){
        return "sy-index";
    }

    @RequestMapping("/htadmin")
    public String admin(){
        return "htadmin";
    }

    @RequestMapping(value = "/hthomes",method = RequestMethod.POST )
    public String htadmin(){
        return "hthome";
    }


    @RequestMapping("/users")
    public String index(Model model){
        try {
            List<Users> list = usersService.findAll();
            model.addAttribute("msg",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "users";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/home")
    public String home(HttpSession session) {
        String red = "home";
        try {
            Users users = (Users) session.getAttribute("users");
            if (users==null){
                red = "redirect:/login";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return red;
    }

    @RequestMapping(value = "/logins",method = RequestMethod.GET )
    public String logining(@RequestParam("username") String username, @RequestParam("password") String password, Model model, Users users,HttpSession httpSession){
        String re = "success";
        try {
            users = usersService.selectByname(username);
            boolean loginType = usersService.login(users.getUsername(),users.getPassword());
            if (loginType){
                users.setPassword("");
                httpSession.setAttribute("users", users);
                model.addAttribute("message","成功");
                return "redirect:/home";
            }else{
                //httpSession.setAttribute("message", "用户名或密码不正确");
                model.addAttribute("message","用户名或密码不正确");
                return "error";
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return re;
    }




}
