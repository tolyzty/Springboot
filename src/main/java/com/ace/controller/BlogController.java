package com.ace.controller;

import com.ace.pojo.Users;
import com.ace.service.BlogService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ace.pojo.Blogs;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */
@Controller
public class BlogController {
    static Logger logger = Logger.getLogger(BlogController.class.getName());

    @Autowired
    BlogService blogService;

    @RequestMapping(value = "/indexblog")
    public String index(Model model){
        try {
            List<Blogs> list = blogService.selectAll();
            model.addAttribute("msg",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "indexblog";
    }

    @RequestMapping(value = "/blogadd",method = RequestMethod.GET)
    public String blogfind(Model model, HttpSession session,HttpServletRequest request){
        String ret = "blogadd";
        Users users = (Users) session.getAttribute("users");
        if (users==null){
            ret="redirect:/login";
        }
        return ret;
    }

    @RequestMapping(value="/blogadds",method = RequestMethod.POST)
    public String blogadd(Model model, Blogs blogs, HttpServletRequest request, HttpSession session){
        int u = 0;
        Users users = (Users) session.getAttribute("users");
        try {
            blogs.setBlogUserid(users.getId());
            blogs.setBlogTitle(request.getParameter("blog_title"));
            blogs.setBlogAbstract(request.getParameter("blog_abstract"));
            blogs.setBlogContent(request.getParameter("blog_content"));
            blogs.setBlogKeyword(request.getParameter("blog_keyword"));
            blogs.setBlogPv(0);
            blogs.setBlogFollow(0);
            blogs.setBlogZt(0);
            blogs.setBlogTime(new Date());
            u = blogService.insert(blogs);
            System.out.println(u);

        }catch (Exception e){
            e.printStackTrace();
        }
        return "login";
    }

    @RequestMapping(value = "/center",method = RequestMethod.GET)
    public ModelAndView GetByID(Model model, HttpSession session, ModelAndView mav){
        Integer blogUserid = 0;
        mav.setViewName("center");
        try {
        Users users = (Users) session.getAttribute("users");
         if (users!=null){
             blogUserid = users.getId();
         }else{
             mav.setViewName("redirect:/login");
         }
            List<Blogs> list = blogService.selectById(blogUserid);
            model.addAttribute("msg",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mav;
    }

    /**
     *
     * @param model 返回一个blogs对象
     * @param id 前台获取的blog的ID
     * @return 返回到指定页面
     */
    @RequestMapping(value = "/blogfind/{id}")
    public String findById(Model model, @PathVariable("id") int id, Blogs blogs){
        int u = 0;
        String result = "blogfind";
        try {
            blogs = blogService.selectByPrimaryKey(id);
            if (blogs!=null){
                blogs.setBlogId(id);
                blogs.setBlogPv(blogs.getBlogPv()+1);
                u = blogService.updatepv(blogs);
                if (u!=0){
                    model.addAttribute("msg",blogs);
                }
            }else{
                result="error";
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }


   /* public int updatepv(@PathVariable("id") int id,Model model,Blogs blogs){
        int u = 0;
        try {

            u = blogService.updatepv(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
*/



}
