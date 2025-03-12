package org.cameroncreates.components.controllers;

import com.quiptmc.core.sql.SqlDatabase;
import com.quiptmc.core.sql.SqlUtils;
import org.cameroncreates.Main;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Controller
public class PageController {


    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("uptime", Main.utils.uptimeManager.getUptime());
        return "home";
    }
}
