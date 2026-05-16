package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.portal.entity.Admin;
import com.portal.service.AdminService;



@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public String openAdminPage(Model model) {
    	System.out.println("return adminS");


        model.addAttribute("list", adminService.getAdminData());
        System.out.println("show listadminS");


        return "AdminPage";
    }

    @PostMapping("/saveAdmin")
    public String saveAdmin(Admin admin) {
    	System.out.println("go to save adminS");

        adminService.createAdmin(admin);
        System.out.println("go to create adminS");


        return "redirect:/admin";
        
    }
}