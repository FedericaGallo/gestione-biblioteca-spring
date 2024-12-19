package com.example.demo.utils;

import com.example.demo.DTO.LendingDTO;
import com.example.demo.entity.Book;
import com.example.demo.entity.Lending;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.springframework.lang.NonNull;

public class LendingConverter {

    public static Lending DTOtoEntityUpdate(LendingDTO lendingDTO, Lending lending) {
        if (lendingDTO.getStartLoan() != null) {
            lending.setStartLoan(lendingDTO.getStartLoan());
        }
        if (lendingDTO.getEndLoan() != null) {
            lending.setEndLoan(lendingDTO.getEndLoan());
        }
        return lending;
    }

    public static Lending DTOtoEntityCreate(LendingDTO lendingDTO) {

        Lending lending = new Lending();
        if (lendingDTO.getStartLoan() != null) {
            lending.setStartLoan(lendingDTO.getStartLoan());
        }
        if (lendingDTO.getEndLoan() != null) {
            lending.setEndLoan(lendingDTO.getEndLoan());
        }
        return lending;
    }

    public static LendingDTO EntityToDTO(Lending lending) {
        LendingDTO lendingDTO = new LendingDTO();
        lendingDTO.setBookAuthor(lending.getBookAuthor());
        lendingDTO.setBookTitle(lending.getBookTitle());
        lendingDTO.setBookId(lending.getBookId());
        lendingDTO.setConsumerId(lending.getConsumerId());
        lendingDTO.setConsumerName(lending.getConsumerName());
        lendingDTO.setConsumerLastName(lending.getConsumerLastName());
        lendingDTO.setEndLoan(lending.getEndLoan());
        lendingDTO.setStartLoan(lending.getStartLoan());
        return lendingDTO;
    }
}
