package com.pm.oauthgoogle.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String welcome(){
        return "Hey Welome to Springboot with Google OAuth2 Example";
    }

    @GetMapping("/userDetails")
    public Principal getLoggedInUserDetails(Principal principal){
        System.out.println("UserName : "+principal.getName());
        return principal;
    }

}
