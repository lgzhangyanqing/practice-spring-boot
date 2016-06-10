package com.msi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.msi.model.Greeting;
/**
 * Created by Dennis on 16/6/10.
 */
@RestController
public class Hello {
    @RequestMapping("/hello")
    public Greeting index(){
        return new Greeting("World");
    }

}
