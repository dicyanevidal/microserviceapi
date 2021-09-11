package com.vidal.dicyane.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/services")
public class ServiceController {

    @GetMapping
    public ArrayList<Service> findAll(){
        return new ArrayList<Service>();
    }
}
