package com.cwa.data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class StaffController {

    @GetMapping("/staffnames")
    public String getStaffName(){
        Staff myStaff = new Staff("Exemple","Developer",10000);
        model.addAttribute("staff",myStaff);
        return "staffnames";
    }
    
}
