package com.navis.advisor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class N4Controller {

    /**
     * Root
     *
     * http://localhost:8080
     *
     * @return String
     */
    @GetMapping("/")
    public String root() {
        return "Hello, this is the n4 controller.";
    }

}
