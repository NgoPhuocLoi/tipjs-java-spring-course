package com.nploi.tipjs_course.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Version {

    @GetMapping("/version")
    public String getVersion() {
        return "1.0.0";
    }
}
