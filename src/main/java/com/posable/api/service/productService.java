package com.posable.api.service;


import com.posable.api.model.product;
import com.posable.api.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/products")
public class productService {

    @Autowired
    productRepository productRepository1;

    @GetMapping(value = "all")
    public List<product> getAll(){

        return productRepository1.findAll();
    }



}
