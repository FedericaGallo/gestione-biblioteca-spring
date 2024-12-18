package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name= "lendings")
public class Lending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idl")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="idb", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name="idc", nullable = false)

    private Consumer consumer;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book= book;
    }

    public String getBookTitle(){
        return book.getTitle();
    }

    public void setBookTitle(String title){
        this.book.setTitle(title);
    }

    public String getBookAuthor(){
        return book.getAuthor();
    }
}
