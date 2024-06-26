package com.example.multitenant.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "city")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class City implements Serializable {

    @Serial
    private static final long serialVersionUID = -4551953276601557391L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public City setId(Long id) {
        this.id = id;
        return this;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

