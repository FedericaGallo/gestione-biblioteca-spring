package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LendingDTO {
    private Integer id;
    private String bookAuthor;
    private String bookTitle;
    private String bookId;
    private String consumerName;
    private String consumerLastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerLastName() {
        return consumerLastName;
    }

    public void setConsumerLastName(String consumerLastName) {
        this.consumerLastName = consumerLastName;
    }
}
