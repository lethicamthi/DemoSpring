package com.example.demo.controller;

import com.example.demo.model.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePageController {
    /*@RequestMapping("/")
    public String index1(){
        return "helloWorld";
    }*/
    @GetMapping("/")
    public String hello(Model model){
        UserDto userDto = new UserDto();
        userDto.setUserID("trieusan");
        model.addAttribute("user", userDto);
        return "helloWorld";
    }

    @RequestMapping("/trieu")
    public String trieu(Model model , UserDto userDto){
        model.addAttribute("user", userDto);
        return "helloWorld";
    }

    @RequestMapping("/Show")
    public String Show(Model model , UserDto userDto){
        model.addAttribute("user", userDto);
        return "Show";
    }

    @GetMapping("/err")
    public String err(Model model){
        return "404";
    }
}
