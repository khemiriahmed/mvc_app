package com.cwa.data;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class StaffController {

    List<Staff> allStaff = Arrays.asList(
        new Staff("Exemple 1","Developer",10000),
        new Staff("Exemple 2","Front-end",30000),
        new Staff("Exemple 3","BackEnd",70000)

    );


    @GetMapping("/staffdetails")
    public String getstaffdetails(Model model){
        model.addAttribute("allStaff",allStaff);
        return "staffdetails";
    }
    
}
