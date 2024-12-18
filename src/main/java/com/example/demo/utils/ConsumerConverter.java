package com.example.demo.utils;

import com.example.demo.DTO.ConsumerDTO;
import com.example.demo.DTO.LendingDTO;
import com.example.demo.entity.Consumer;
import com.example.demo.entity.Lending;

import java.util.ArrayList;
import java.util.List;

public class ConsumerConverter {

   public static ConsumerDTO entityToDTO(Consumer consumer){
       ConsumerDTO consumerDTO = new ConsumerDTO();
       consumerDTO.setId(consumer.getId());
       consumerDTO.setName(consumer.getName());
       consumerDTO.setLastName(consumer.getLastName());
       List<LendingDTO> lendingsDTO = new ArrayList<>();
       for (Lending lending : consumer.getLendings()){

           LendingDTO lendingDTO = new LendingDTO();
           lendingDTO.setBookTitle(lending.getBook().getTitle());
           lendingDTO.setBookAuthor(lending.getBook().getAuthor());
           lendingDTO.setBookId(lending.getBook().getId());
           System.out.println(lendingDTO.getBookAuthor());
           lendingsDTO.add(lendingDTO);
       }
       consumerDTO.setLendings(lendingsDTO);
       for (LendingDTO lending : consumerDTO.getLendings()){

           System.out.println(lending.getBookAuthor());

       }
       return consumerDTO;
   }
}
