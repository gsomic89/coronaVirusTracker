package io.javabrains.coronavirustracker.controllers;

import io.javabrains.coronavirustracker.models.LocationStats;
import io.javabrains.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model ){
        List<LocationStats> totalStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = totalStats.stream().mapToInt(stat -> Integer.parseInt(stat.getLatestTotal())).sum();
        model.addAttribute("locationStats", totalStats);
        model.addAttribute("totalReportedCases", totalReportedCases);

        return "home";
    }
}
