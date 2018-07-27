package com.island.repository;

import com.island.model.Commerce;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommerceRepository extends MongoRepository<Commerce, String> {

    List<Commerce> findByDepartment(String departmentId);
}
