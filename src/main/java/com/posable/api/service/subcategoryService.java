package com.posable.api.service;

import com.posable.api.model.subcategory;
import com.posable.api.repository.subcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/subcategory")
public class subcategoryService {

    @Autowired
    subcategoryRepository subcategoryRepository1;

    @GetMapping(value = "all")
    public List<subcategory> getAll(){

        return subcategoryRepository1.findAll();
    }
}
