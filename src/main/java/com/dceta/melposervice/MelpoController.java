package com.dceta.melposervice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MelpoController {

    @RequestMapping
    public String home() {
        return "Hello World!";
    }
}
