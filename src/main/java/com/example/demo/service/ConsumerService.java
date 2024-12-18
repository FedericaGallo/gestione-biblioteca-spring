package com.example.demo.service;

import com.example.demo.repository.ConsumerRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    private final ConsumerRepository consumerRepository;
    public ConsumerService(ConsumerRepository consumerRepository){
        this.consumerRepository= consumerRepository;
    }


}
