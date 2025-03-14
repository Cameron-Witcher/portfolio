package org.cameroncreates.components.controllers;

import org.cameroncreates.projects.Projects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;

@Controller
public class PageController {


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("email", "cameronwitcher1@gmail.com");
        model.addAttribute("name", "Cameron Witcher");
        model.addAttribute("phone", "+1 (785) 214-0119");
        model.addAttribute("projects", Projects.values());
        return "home";
    }


    @GetMapping("/portfolio/{projectId}")
    public String portfolioDetails(Model model, @PathVariable String projectId) {
        model.addAttribute("projectId", Projects.valueOf(projectId.toUpperCase(Locale.ROOT)).instance());
        return "portfolio";
    }
}
