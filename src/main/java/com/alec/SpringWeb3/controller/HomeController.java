package com.alec.SpringWeb3.controller;


import com.alec.SpringWeb3.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index" ;
    }

    @RequestMapping("addAlien")

    public ModelAndView add(@RequestParam("aid") int aid , @RequestParam("aname") String aname , ModelAndView mv){


       Alien alien = new Alien() ;
       alien.setAid(aid);
       alien.setAname(aname);

        mv.addObject("alien" , alien) ;

        mv.setViewName("result"); ;

        return mv;
    }
}
