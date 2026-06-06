package com.cwa.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;


@Controller
public class FormController {

    // Staff myStaff = new Staff("Exemple 4", "Developer", 10000);
    List<Staff> AllStaff = new ArrayList<>();

    @GetMapping("/")
    public String addNewStaff(Model model) {
        Staff myStaff = new Staff();
        model.addAttribute("addNewStaff", myStaff);
        return "staffform";
    }

    @PostMapping("/dataSubmitForm")
    public String dataSubmitForm(@Valid @ModelAttribute("addNewStaff") Staff staff,BindingResult result) {
        //System.out.println(result.hasErrors());
        if(result.hasErrors()) {
            
            return "staffform";
        }
        AllStaff.add(staff);
        return "redirect:/getallstaff";
    }

    @GetMapping("/getallstaff")
    public String getAllstaff(Model model) {
         model.addAttribute("AllStaff", AllStaff);
        return "getallstaff";
    }

}
