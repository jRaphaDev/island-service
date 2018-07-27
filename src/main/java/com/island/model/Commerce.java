package com.island.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "commerce")
public class Commerce implements Serializable {

    private String id;
    private String name;
    private Department department;

}
