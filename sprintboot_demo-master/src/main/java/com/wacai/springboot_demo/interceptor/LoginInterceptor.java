package com.wacai.springboot_demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO 类描述
 *
 * @author pojun
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse, Object o) throws Exception {
        long starttime = System.currentTimeMillis();
        httpServletRequest.setAttribute("starttime",starttime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)
            throws Exception {
        long starttime = (Long)httpServletRequest.getAttribute("starttime");
        long endtime = System.currentTimeMillis();
        System.out.println("本次请求"+httpServletRequest.getRequestURI().toString()+"时间为："+new Long(endtime - starttime)+"ms");
        httpServletRequest.setAttribute("handlingTime",endtime-starttime);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
