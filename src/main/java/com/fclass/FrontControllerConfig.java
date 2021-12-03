package com.fclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.fclass"})
public class FrontControllerConfig {
    @Bean//just like the Java Configuration of spring Class in Spring Core
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        //webapp is the root directory so only a / is fine but if we move jsp files to a folder we have to mention here
        vr.setPrefix("/");//so that we can change the location of the files if we want to without any problem
        vr.setSuffix(".jsp");//so we don't have to mention it in the controller's ModelAndView (help to change to other tech later)
        return vr;
    }
}
