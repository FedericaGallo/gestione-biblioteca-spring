package com.example.demo.service;

import com.example.demo.DTO.BookDTO;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.utils.BookConverter;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public Book getBookById(String id){
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()){
            return book.get();
        }else throw new EntityNotFoundException();

    }
    public void deleteBook(String id){
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()){
            bookRepository.delete(book.get());
        }else throw new EntityNotFoundException();

    }

    public BookDTO updateBook(String id, BookDTO bookDTO){
        Optional<Book> existingBook = bookRepository.findById(id);
        if(existingBook.isPresent()){
           Book bookToSave= BookConverter.DTOToEntityUpdate(bookDTO, existingBook.get());
           Book bookSaved= bookRepository.save(bookToSave);
           return BookConverter.EntityToDTO(bookSaved);
        }else throw new EntityNotFoundException();
    }

    public BookDTO addBook(BookDTO bookDTO){
      Book bookSaved = bookRepository.save(BookConverter.DTOToEntityCreate(bookDTO));
      return BookConverter.EntityToDTO(bookSaved);
    }

    public List<BookDTO> findAll(){
        List<Book> books = bookRepository.findAll();
        List<BookDTO> booksDTO = new ArrayList<>();
         for (Book book : books){
           BookDTO bookDTO = new BookDTO();
             bookDTO.setTitle(book.getTitle());
             bookDTO.setAuthor(book.getAuthor());
             bookDTO.setId(book.getId());
             booksDTO.add(bookDTO);
          }
         return booksDTO;
    }
}
