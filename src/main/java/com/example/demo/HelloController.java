package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	UserRepository repo;
	
    @RequestMapping("/")
    public String index() {
    	
    //1
        return repo.findAll().toString();
    }

}