package com.island.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
}
