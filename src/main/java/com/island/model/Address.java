package com.island.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String street;
    private String number;
    private String district;
}
