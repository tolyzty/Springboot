package com.ace.controller;

import com.ace.pojo.Blogs;
import com.ace.pojo.Lables;
import com.ace.service.BlogService;
import com.ace.service.LablesService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/23.
 */
@Controller
public class LablesController {
    static Logger logger = Logger.getLogger(LablesController.class.getName());

    @Autowired
    LablesService lablesService;
    @Autowired
    BlogService blogService;

    @RequestMapping(value = "/Getinfo",method = RequestMethod.POST)
    public  @ResponseBody
    String GetByUidAndBid(Model model, Lables lables, @RequestParam("uid") Integer uid, @RequestParam("bid") Integer bid){
        String result = "";
        try {
            lables.setLableUserid(uid);
            lables.setLableBlogid(bid);
            lables = lablesService.findById(lables);
            if(lables!=null){
                result = lables.getLableInfo();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/Collection",method = RequestMethod.POST)
    @ResponseBody
    public int Collection(Lables lables, Blogs blogs, @RequestParam("uid") Integer uid, @RequestParam("bid") Integer bid){
        int u = 0;
        try {
            lables.setLableInfo("true");
            lables.setLableStut(0);
            lables.setLableUserid(uid);
            lables.setLableBlogid(bid);
            lables.setLableTime(new Date());
            u = lablesService.insertinfo(lables);
            if (u==1){
                blogs = blogService.selectByPrimaryKey(bid);
                if (blogs!=null){
                    blogs.setBlogId(bid);
                    blogs.setBlogFollow(blogs.getBlogFollow()+1);
                    u = blogService.updatefollow(blogs);
                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return u;
    }
}
