package com.example.UrlHitCounters.service;


import com.example.UrlHitCounters.model.UrlHitCounter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    static Map<String,Integer> h= new HashMap<>();
    public UrlHitCounter getvisit(String name){
        int count=h.getOrDefault(name,0)+1;
        h.put(name,count);
        UrlHitCounter urlhitcounter=new UrlHitCounter(name,count);
        return urlhitcounter;
    }
}
