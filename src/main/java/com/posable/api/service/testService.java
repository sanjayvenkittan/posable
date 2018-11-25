package com.posable.api.service;


import com.posable.api.repository.testRepository;
import com.posable.api.model.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/testdata")
public class testService {

    @Autowired
    testRepository testRepository1;

    @GetMapping(value = "all")
    public List<test> getAll(){
        return  testRepository1.findAll();
    }
}
