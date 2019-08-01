package citi.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String viewLogin(){
        return "login";
    }

    @GetMapping("/logon/logon")
    public String logon(){
        return "logon/logon";
    }
    @GetMapping("/logon/userAg")
    public String showUserAg(){
        return "logon/userAg";
    }
}
