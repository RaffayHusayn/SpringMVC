package com.fclass;

import com.fclass.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AddController {

    @RequestMapping("/add") //name of action in the form in index.jsp, doesn't depend on the name of class or method or anything other than mapping
   public ModelAndView show(@RequestParam("num1") int  num1, @RequestParam("num2") int num2){
//        int num1 = Integer.parseInt(request.getParameter("num1")); //works with both get and post method
//        int num2 = Integer.parseInt(request.getParameter("num2")); //works with both get and post method

        AddService addService = new AddService();
        int add = addService.add(num1, num2);// in complicated applications, controllers don't do processing so we are just
        //following that
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show.jsp"); // this is the name of the view
        mv.addObject("addResult", add); // this is the
        return mv;
   }
}
