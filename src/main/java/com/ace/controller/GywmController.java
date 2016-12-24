package com.ace.controller;


import com.ace.pojo.Gywm;
import com.ace.service.GywmService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.List;



@Controller
public class GywmController {

    static Logger logger = Logger.getLogger(GywmController.class.getName());

    @Autowired
    GywmService gywmService;

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/{id}/gsxw")
    public String GetById(@PathVariable("id") Long id, Model model){
        try {
            List<Gywm> list = gywmService.selectById(id);
            model.addAttribute("msg",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "gsxw";
    }

    @RequestMapping(value = "/{gsxw}/gsxwx/{id}")
    public String GetByKey(@PathVariable("id") Long id,Model model){
        try {
            Gywm gywm = gywmService.selectByKey(id);
            gywm.getGywmId();
            gywm.getGywmName();
            gywm.getGywmJj();
            gywm.getGywmNr();
            gywm.getGywmCzsj();
            model.addAttribute("msg",gywm);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "gsxwx";
    }
    @RequestMapping(value = "/{gsxw}/{id}/editabout")
    public String EditById(@PathVariable("id") Long id, Model model, HttpServletRequest request,Date date){
        try {
            Gywm gywm = gywmService.selectByKey(id);
            gywm.getGywmId();
            gywm.getGywmName();
            gywm.getGywmJj();
            gywm.getGywmCzsj();
            gywm.getGywmUrl();
            gywm.getGywmNr();
            model.addAttribute("msg",gywm);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "editabout";
    }



    @RequestMapping(value = "/{gsxw}/{id}/editabout",method = RequestMethod.POST)
    public String Editsub(@PathVariable("id") Long id, Model model, HttpServletRequest request,Gywm gywm){
        Date date = new Date();
        logger.info(date +"时间");
        try {
            gywm.setGywmName(request.getParameter("gname"));
            gywm.setGywmUrl(request.getParameter("gurl"));
            gywm.setGywmJj(request.getParameter("gjj"));
            gywm.setGywmNr(request.getParameter("gnr"));
            gywm.setGywmTpwjm(request.getParameter("gtpwjm"));
            gywm.setGywmId(id);
            gywm.setGywmCzsj(date);
            this.gywmService.updateByGywm(gywm);
            model.addAttribute("msg",gywm);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/index";

    }


}
