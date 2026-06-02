package com.cwa.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class StaffController {

    @GetMapping("/staffnames")
    public String getStaffName(){
        return "staffnames";
    }
    
}
