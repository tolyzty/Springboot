package com.ace.Util;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/12/21.
 */
public class SessionFilter extends OncePerRequestFilter {

    protected void doFilterInternal(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //不过滤
        String[] notFilter = new String[]{
                "/js","/css","/fonts","img","/login","indexblog"
        };
        //请求的url
        String uri = request.getRequestURI();
        //是否过滤
        boolean doFilter = true;
        for (String s:notFilter){
            if (uri.indexOf(s)!=-1){
                doFilter = false;
                break;
            }
        }
        if (doFilter){
            Object obj = request.getSession().getAttribute("users");
            if (obj==null){
                request.setCharacterEncoding("UTF-8");
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = response.getWriter();
                String loginPage = "....";
                StringBuilder builder = new StringBuilder();
                builder.append("<script type=\"text/javascript\">");
                builder.append("alert('网页过期，请重新登录！');");
                builder.append("window.top.location.href='");
                builder.append(loginPage);
                builder.append("';");
                builder.append("</script>");
                out.print(builder.toString());
            }else{
                filterChain.doFilter(request,response);
            }
        }else{
            filterChain.doFilter(request,response);
        }
    }
}
