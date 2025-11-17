package com.alec.SpringWeb3.controller;


import com.alec.SpringWeb3.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }

    @RequestMapping("/")
    public String home(){
        return "index" ;
    }


    @RequestMapping("addAlien")

    public String AddAlien(@ModelAttribute Alien alien){
        return "result" ;
    }
}
