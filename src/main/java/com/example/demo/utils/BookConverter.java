package com.example.demo.utils;

import com.example.demo.DTO.BookDTO;
import com.example.demo.entity.Book;
import java.util.UUID;

public class BookConverter {
    public static Book DTOToEntityUpdate(BookDTO bookDTO, Book book){

        if(bookDTO.getAuthor() != null && !bookDTO.getAuthor().isEmpty()){
            book.setAuthor(bookDTO.getAuthor());
        }
        if(bookDTO.getTitle() != null && !bookDTO.getTitle().isEmpty()){
            book.setTitle(bookDTO.getTitle());
        }
        return book;
    }

    public static Book DTOToEntityCreate(BookDTO bookDTO){
        Book book = new Book();
        if(bookDTO.getAuthor() != null && !bookDTO.getAuthor().isEmpty()){
            book.setAuthor(bookDTO.getAuthor());
        }
        if(bookDTO.getTitle() != null && !bookDTO.getTitle().isEmpty()){
            book.setTitle(bookDTO.getTitle());
        }
        UUID uuid = UUID.randomUUID();
        book.setId(uuid.toString());
        System.out.println(uuid.toString());
        return book;
    }

    public static BookDTO EntityToDTO(Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setId(book.getId());
        return bookDTO;
    }
}
