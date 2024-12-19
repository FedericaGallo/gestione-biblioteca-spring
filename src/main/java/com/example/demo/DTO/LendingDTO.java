package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LendingDTO {
    private Integer id;
    private String bookAuthor;
    private String bookTitle;
    private String bookId;
    private String consumerName;
    private String consumerLastName;
    private Integer consumerId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private LocalDate startLoan;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private LocalDate endLoan;

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

    public String getBookId() {
        return bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setConsumerId(Integer id) {
        this.consumerId = id;
    }

    public Integer getConsumerId() {
        return consumerId;
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

    public LocalDate getStartLoan() {
        return startLoan;
    }

    public LocalDate getEndLoan() {
        return endLoan;
    }

    public void setStartLoan(LocalDate startLoan) {
        this.startLoan = startLoan;
    }

    public void setEndLoan(LocalDate endLoan) {
        this.endLoan = endLoan;
    }

}
