package org.cameroncreates.components.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("email", "cameronwitcher1@gmail.com");
        model.addAttribute("name", "Cameron Witcher");
        model.addAttribute("phone", "+1 (785) 214-0119");
        return "home";
    }
}
