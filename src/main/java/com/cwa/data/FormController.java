package com.cwa.data;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    Staff myStaff = new Staff("Exemple 4", "Developer", 10000);
            


    @GetMapping("/form")
    public String getstaffForm(Model model) {
        model.addAttribute("Staff", myStaff);
        return "staffform";
    }

}
