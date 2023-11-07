package com.project.docshift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @GetMapping("/")
    public String renderPage() {
        return "index";
    }

    @GetMapping("/login")
    public String renderLoginPage() {
        return "login.xhtml";
    }

    @GetMapping("/home")
    public String renderHomePage() {
        return "home.xhtml";
    }
    
    @GetMapping("/settings")
    public String renderSettingsPage() {
        return "settings.xhtml";
    }

    @GetMapping("/new-doctor")
    public String renderDoctorPage() {
        return "new-doctor.xhtml";
    }
    
    @GetMapping("/new-patient")
    public String renderPatientPage() {
        return "new-patient.xhtml";
    }


}
