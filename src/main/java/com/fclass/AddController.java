package com.fclass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AddController {

    @RequestMapping("/add") //name of action in the form in index.jsp
   public ModelAndView show(HttpServletRequest request, HttpServletResponse response){
        int num1 = Integer.parseInt(request.getParameter("num1")); //works with both get and post method
        int num2 = Integer.parseInt(request.getParameter("num2")); //works with both get and post method
        int add = num1 + num2;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("show.jsp"); // this is the name of the view
        mv.addObject("addResult", add); // this is the
        return mv;
   }
}
