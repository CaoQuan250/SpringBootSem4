package com.springboot.Management.controller;

import com.springboot.Management.model.ManagerModel;
import com.springboot.Management.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ManagementController {
    @Autowired
    private ManagerService managerService;
    @GetMapping("/create")
    private String create(Model model){
        ManagerModel managerModel = new ManagerModel();
        model.addAttribute("mng",managerModel);
        return "/create";
    }
    @RequestMapping("/save")
    private String save(ManagerModel managerModel){
        managerService.save(managerModel);
        return "redirect:/list";
    }
    @GetMapping("/list")
    private String getAll(Model model){
        model.addAttribute("mngList",managerService.getAll());
        return "home";
    }
    @GetMapping("/detail/{id}")
    private String getOne(@PathVariable Long id,Model model){
        model.addAttribute("mngDetail",managerService.getOne(id));
        return "detail";
    }
    @GetMapping("/update/{id}")
    private String update(@PathVariable Long id,Model model){
        model.addAttribute("mngUpdate",managerService.getOne(id));
        return "update";
    }
    @RequestMapping("/saveUpdate")
    private String saveUpdate(ManagerModel managerModel ){
        managerService.save(managerModel);
        return "redirect:/list";
    }
    @RequestMapping("/delete/{id}")
    private String getOne(@PathVariable Long id){
        managerService.delete(id);
        return "redirect:/list";
    }
}
