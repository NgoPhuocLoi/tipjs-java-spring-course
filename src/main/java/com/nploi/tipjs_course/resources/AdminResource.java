package com.nploi.tipjs_course.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/admin")
@RestController
public class AdminResource {

    @GetMapping("/vip")
    public String vipZone() {
        return "Welcome to the VIP zone!";
    }

    @GetMapping("/normal")
    public String normalZone() {
        return "Welcome to the normal zone!";
    }
}