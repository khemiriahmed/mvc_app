package com.cwa.data;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class StaffController {

    List<Staff> allStaff = new ArrayList<>();


    @GetMapping("/staffdetails")
    public String getstaffdetails(Model model){
        allStaff.add(new Staff("Exemple 1","Developer",10000));
        allStaff.add(new Staff("Exemple 2","Front-end",30000));
        allStaff.add(new Staff("Exemple 3","BackEnd",70000));
        model.addAttribute("allStaff",allStaff);
        return "staffdetails";
    }
    
}
