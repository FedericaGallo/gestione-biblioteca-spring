package com.example.demo.utils;

import com.example.demo.DTO.BookDTO;
import com.example.demo.entity.Book;

public class BookConverter {
    public static Book DTOToEntity(BookDTO bookDTO, Book book){

        if(bookDTO.getAuthor() != null && !bookDTO.getAuthor().isEmpty()){
            book.setAuthor(bookDTO.getAuthor());
        }
        if(bookDTO.getTitle() != null && !bookDTO.getTitle().isEmpty()){
            book.setTitle(bookDTO.getTitle());
        }
        return book;
    }
}
