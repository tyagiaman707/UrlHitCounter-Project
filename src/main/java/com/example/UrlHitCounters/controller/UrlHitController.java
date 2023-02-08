package com.example.UrlHitCounters.controller;

import com.example.UrlHitCounters.model.UrlHitCounter;
import com.example.UrlHitCounters.service.UrlHitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-count-app")

public class UrlHitController {
    private UrlHitService urlhitservice;
    private UrlHitController(UrlHitService urlhitservice){
        this.urlhitservice = urlhitservice;
    }
    @GetMapping("/name/{name}/countNumber")
    public UrlHitCounter getnumber(@PathVariable String name){
        UrlHitCounter urlhitcounter = urlhitservice.getvisit(name);
        return urlhitcounter;
    }
}

