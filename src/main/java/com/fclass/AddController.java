package com.fclass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

    @RequestMapping("/add") //name of action in the form in index.jsp
   public void show(){
       System.out.println("in the add class function show");
   }
}
