package com.learning.controller;

import com.learning.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class MainController {

    @Autowired
    UrlService service;

    @GetMapping("/")
    public String loadHome(){
        return "index";
    }

    @PostMapping(value = "/generateUrl")
    public ModelAndView generateUrl(@RequestParam("url") String url){
        String surl = service.generateUrl(url);
        ModelAndView mv = new ModelAndView();
        mv.addObject("surl", surl);
        mv.setViewName("index");
        return mv;
    }

}
