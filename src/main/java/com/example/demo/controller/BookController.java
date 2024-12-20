package com.example.demo.controller;

import com.example.demo.DTO.BookDTO;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("/getBookById/{id}")
    public ResponseEntity<BookDTO> getBook(@PathVariable("id") String id) {
        BookDTO book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") String id){
        bookService.deleteBook(id);
        return ResponseEntity.ok("book deleted");

    }

    @PutMapping("/updateBook/{id}")
    public ResponseEntity<BookDTO> updateBook(@PathVariable("id") String id, @RequestBody BookDTO bookDTO){
        BookDTO savedBook = bookService.updateBook(id, bookDTO);
        return ResponseEntity.ok(savedBook);
    }

    @PostMapping("/createBook")
    public ResponseEntity<BookDTO> addBook(@RequestBody BookDTO bookDTO){
        BookDTO savedBook = bookService.addBook(bookDTO);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<BookDTO>> findAll(){
       List<BookDTO> booksDTO = bookService.findAll();
        return ResponseEntity.ok(booksDTO);
    }

}
