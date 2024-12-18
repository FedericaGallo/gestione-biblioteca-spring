package com.example.demo.service;

import com.example.demo.DTO.ConsumerDTO;
import com.example.demo.entity.Consumer;
import com.example.demo.repository.ConsumerRepository;
import com.example.demo.utils.ConsumerConverter;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConsumerService {
    private final ConsumerRepository consumerRepository;
    public ConsumerService(ConsumerRepository consumerRepository){
        this.consumerRepository= consumerRepository;
    }
public ConsumerDTO getConsumerById(Integer id){
    Optional<Consumer> consumer = consumerRepository.findById(id);
    if(consumer.isPresent()){
        return ConsumerConverter.entityToDTO(consumer.get());
    }else throw new EntityNotFoundException();
}

    public List<ConsumerDTO> findAll(){
       List<Consumer> consumers = consumerRepository.findAll();
       List<ConsumerDTO> consumersDTO = new ArrayList<>();
       for (Consumer consumer : consumers){
           ConsumerDTO consumerDTO = new ConsumerDTO();
           consumerDTO.setName(consumer.getName());
           consumerDTO.setLastName(consumer.getLastName());
           consumerDTO.setId(consumer.getId());
           System.out.println(consumer.getLendings());
           consumersDTO.add(consumerDTO);
       }
       return consumersDTO;
    }

}
