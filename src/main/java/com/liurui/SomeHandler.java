package com.liurui;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SomeHandler implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
       mv.addObject("message","hello,springmvc");
        mv.setViewName("welcome");
        System.out.println("huanyingguanling");
        System.out.println("uasi");
        System.out.println("sdvsk");
        System.out.println("dsjvssss");
        System.out.println("dscvsivb");
        return mv;
    }
}
