package com.island.controller;

import com.island.model.Department;
import com.island.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping("/department")
    public ResponseEntity<?> findAll() {
        List<Department> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
