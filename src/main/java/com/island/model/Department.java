package com.island.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "department")
public class Department implements Serializable {

    private String id;
    private String name;
}
