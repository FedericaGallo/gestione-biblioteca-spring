package com.example.demo.DTO;

import com.example.demo.entity.Lending;

import java.util.List;

public class ConsumerDTO {
    private Integer id;
    private String name;
    private String lastName;
    private List<LendingDTO> lendings;

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
    public void setLendings(List<LendingDTO> lendings){
        this.lendings = lendings;
    }

    public List<LendingDTO> getLendings(){
        return lendings;
    }
}
