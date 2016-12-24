package com.ace.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.ace.pojo.Gywm;
import com.ace.service.GywmService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */
@Controller
@RequestMapping("apiController")
public class apiController {

    @Autowired
    GywmService gywmService;

   /* @RequestMapping(value = "/hello.json", method = RequestMethod.GET)*/
// 该注解用于读取Request请求的body部分数据，使用系统默认配置的HttpMessageConverter进行解析，然后把相应的数据绑定到要返回的对象上；

// 那么我们要访问此方法是 完整路径应该是http://ip地址:端口/SpringMVC/HelloController/hello.json
 /*   public Object hello() {
        return "Hello SpringMVC!";
    }*/

    @RequestMapping(value = "/{id}/gsxw")
    @ResponseBody
    public String GetById(@PathVariable("id") Long id, Model model,Gywm gywm){
        JSONArray json = new JSONArray();
        JSONObject joo = new JSONObject();
        try {
            List<Gywm> list = gywmService.selectById(id);
            for(Gywm gywms:list){
                JSONObject jo = new JSONObject();
                jo.put("gywm_id",gywms.getGywmId());
                jo.put("gywm_name",gywms.getGywmName());
                json.add(jo);

            }


            System.out.println(json.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return json.toString();
    }


}
