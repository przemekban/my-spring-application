package com.bankowski.springkurs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    ModelAndView myFirstView(ModelAndView modelAndView, @RequestParam(defaultValue = "Przemek") String name){

        logger.info("name: {}", name);
        logger.warn("name: {}", name);
        logger.error("name: {}", name);
        modelAndView.addObject("user", name);
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("/person")
    ModelAndView personView(ModelAndView modelAndView, @RequestParam(defaultValue = "Kacper") String name,
                            @RequestParam(defaultValue = "Jędrzejewski") String surname,
                            @RequestParam(defaultValue = "22") int age){
        modelAndView.addObject("name", name);
        modelAndView.addObject("surname", surname);
        modelAndView.addObject("age", age);
        modelAndView.setViewName("person");
        return modelAndView;
    }
}
