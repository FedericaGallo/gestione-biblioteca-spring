package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "lendings")
public class Lending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idl")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idb", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "idc", nullable = false)
    private Consumer consumer;

    @Column(name = "start_loan")
    private LocalDate startLoan;
    @Column(name = "end_loan")
    private LocalDate endLoan;

    public Lending() {
        this.book = new Book();
        this.consumer = new Consumer();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBookTitle() {
        return book.getTitle();
    }

    public void setBookTitle(String title) {
        this.book.setTitle(title);
    }

    public String getBookAuthor() {
        return book.getAuthor();
    }

    public void setBookAuthor(String author) {
        this.book.setAuthor(author);
    }

    public String getBookId() {
        return book.getId();
    }

    public void setStartLoan(LocalDate startLoan) {
        this.startLoan = startLoan;
    }

    public LocalDate getEndLoan() {
        return endLoan;
    }

    public void setEndLoan(LocalDate endLoan) {
        this.endLoan = endLoan;
    }

    public LocalDate getStartLoan() {
        return startLoan;
    }

    public String getConsumerName() {
        return consumer.getName();
    }

    public String getConsumerLastName() {
        return consumer.getLastName();
    }

    public Integer getConsumerId() {
        return consumer.getId();
    }

    public void setConsumerId(Integer id) {
        this.consumer.setId(id);
    }

    public void setBookId(String id) {
        this.book.setId(id);
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }
}
