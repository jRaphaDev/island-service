package com.island.controller;

import com.island.model.Commerce;
import com.island.service.CommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommerceController {

    @Autowired
    private CommerceService service;

    @GetMapping("/commerce")
    public ResponseEntity<?> findAll() {
        List<Commerce> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/commerce/departament/{departmentId}")
    public ResponseEntity<?> findByDepartment(@PathVariable final String departmentId) {
        List<Commerce> list = service.findByDepartment(departmentId);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
