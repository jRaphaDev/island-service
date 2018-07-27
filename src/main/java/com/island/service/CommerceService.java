package com.island.service;

import com.island.model.Commerce;
import com.island.repository.CommerceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommerceService {

    @Autowired
    private CommerceRepository repository;

    public List<Commerce> findAll(){
        return repository.findAll();
    }

    public List<Commerce> findByDepartment(String departmentId){
        return repository.findByDepartment(departmentId);
    }
}
