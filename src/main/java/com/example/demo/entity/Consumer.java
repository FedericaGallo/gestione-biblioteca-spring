package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "consumers")
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name= "idc")
    private Integer id;
    @Column(name= "name")
    private String name;
    @Column(name= "last_name")
    private String lastName;
    @OneToMany(mappedBy = "consumer", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Lending> lendings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public List<Lending> getLendings(){
        return this.lendings;
    }
}
