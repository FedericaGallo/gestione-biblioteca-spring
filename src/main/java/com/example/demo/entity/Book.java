package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name ="idb")
    private String id;
    @Column(name="title")
    private String title;
    @Column(name="author")
    private String author;
    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
    private List<Lending> lendings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
