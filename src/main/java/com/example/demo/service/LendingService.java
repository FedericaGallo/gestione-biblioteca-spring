package com.example.demo.service;

import com.example.demo.DTO.LendingDTO;
import com.example.demo.entity.Book;
import com.example.demo.entity.Consumer;
import com.example.demo.entity.Lending;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.ConsumerRepository;
import com.example.demo.repository.LendingRepository;
import com.example.demo.utils.LendingConverter;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class LendingService {
    private final LendingRepository lendingRepository;
    private final BookRepository bookRepository;
    private final ConsumerRepository consumerRepository;
    public LendingService(LendingRepository lendingRepository, BookRepository bookRepository, ConsumerRepository consumerRepository){
        this.lendingRepository = lendingRepository;
        this.bookRepository = bookRepository;
        this.consumerRepository = consumerRepository;
    }
    public LendingDTO getLendingById(Integer id){
        Optional<Lending> lending = lendingRepository.findById(id);
        if(lending.isPresent()){
            return LendingConverter.EntityToDTO(lending.get());
        }else throw new EntityNotFoundException();

    }
    public void deleteLending(Integer id){
        Optional<Lending> lending = lendingRepository.findById(id);
        if(lending.isPresent()){
            lendingRepository.delete(lending.get());
        }else throw new EntityNotFoundException();

    }
    public LendingDTO updateLending(Integer id, LendingDTO lendingDTO){
        Optional<Lending> existingLending = lendingRepository.findById(id);
        if(existingLending.isPresent()){
            Lending lendingToSave= LendingConverter.DTOtoEntityUpdate(lendingDTO, existingLending.get());
            Lending lendingSaved= lendingRepository.save(lendingToSave);
            return LendingConverter.EntityToDTO(lendingSaved);
        }else throw new EntityNotFoundException();
    }

    public LendingDTO addLending(LendingDTO lendingDTO){
        Lending lending = LendingConverter.DTOtoEntityCreate(lendingDTO);
        Book book = bookRepository.findById(lendingDTO.getBookId()).orElseThrow(() -> new RuntimeException("Book not found"));
        Consumer consumer = consumerRepository.findById(lendingDTO.getConsumerId()).orElseThrow(() -> new RuntimeException("Book not found"));
        lending.setBook(book);
        lending.setConsumer(consumer);
        Lending lendingSaved = lendingRepository.save(lending);
        return LendingConverter.EntityToDTO(lendingSaved);
    }

    public List<LendingDTO> findAll(){
        List<Lending> lendings = lendingRepository.findAll();
        List<LendingDTO> lendingsDTO = new ArrayList<>();
        for (Lending lending : lendings){
            LendingDTO lendingDTO = LendingConverter.EntityToDTO(lending);
            lendingsDTO.add(lendingDTO);
        }
        return lendingsDTO;
    }
}
