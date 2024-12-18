package com.example.demo.service;

import com.example.demo.DTO.BookDTO;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public Book getBookById(Integer id){
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()){
            return book.get();
        }else throw new EntityNotFoundException();

    }
    public void deleteBook(Integer id){
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()){
            bookRepository.delete(book.get());
        }else throw new EntityNotFoundException();

    }

    public BookDTO updateBook(Integer id, BookDTO bookDTO){
        Optional<Book> existingBook = bookRepository.findById(id);
        if(existingBook.isPresent()){
            bookRepository.save(existingBook.get());
        }else throw new EntityNotFoundException();

    }
}
