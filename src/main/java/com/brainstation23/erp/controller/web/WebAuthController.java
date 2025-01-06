package com.brainstation23.erp.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/web-auth")
public class WebAuthController {
    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }
}
