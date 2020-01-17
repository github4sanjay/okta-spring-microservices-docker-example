package com.okta.developer.docker_microservices.service.controllers;


import com.okta.developer.docker_microservices.service.dtos.TeachingClassDto;
import com.okta.developer.docker_microservices.service.services.TeachingClassService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/class")
public class TeachingClassController {


    private final TeachingClassService teachingClassService;

    public TeachingClassController(TeachingClassService teachingClassService) {
        this.teachingClassService = teachingClassService;
    }

    @GetMapping
    public ResponseEntity<List<TeachingClassDto>> listClasses(){
        return new ResponseEntity<>(teachingClassService.listClasses(), HttpStatus.OK);
    }



}
