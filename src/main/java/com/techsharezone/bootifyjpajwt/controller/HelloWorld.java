package com.techsharezone.bootifyjpajwt.controller;

/*
 * @created 22/11/2020 -01:13
 * @project bootifyjpajwt
 * @author  saurabhshcs
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

    @GetMapping("/helloWorld")
    public String helloWorld() {
    return "You're logged-in successfully";
    }

}
