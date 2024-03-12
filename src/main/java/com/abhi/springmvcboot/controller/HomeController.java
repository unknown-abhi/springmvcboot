package com.abhi.springmvcboot.controller;

import com.abhi.springmvcboot.Repository.AlienRepo;
import com.abhi.springmvcboot.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    AlienRepo repository;

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("message", "Hello World!");
    }
    @RequestMapping("/")
    public String home() {
        System.out.println("Hello World! \nWelcome to Home");
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("add");

        int sum = i+j;
        mv.addObject("sum", sum);
        return mv;
    }

    @PostMapping("/addAlien")
    public String addAlien(@ModelAttribute Alien a) {

        repository.save(a);
        return "add";
    }

    @GetMapping("/getAliens")
    public String getAliens(Model model) {

//        List<Alien> list = Arrays.asList(new Alien(11, "Abhi"), new Alien(12, "Alam"));
        model.addAttribute("result", repository.findAll());
        return "show";
    }

    @GetMapping("/getAlien")
    public String getAlien(@RequestParam int id,Model model) {

        model.addAttribute("result", repository.getReferenceById(id));
        return "show";
    }

    @GetMapping("/getAlienByName")
    public String getAlienByName(@RequestParam String name, Model model) {

//        model.addAttribute("result", repository.findByName(name));
        model.addAttribute("result", repository.find(name));
        return "show";
    }
}
