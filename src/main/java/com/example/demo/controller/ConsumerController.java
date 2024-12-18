package com.example.demo.controller;

import com.example.demo.DTO.BookDTO;
import com.example.demo.DTO.ConsumerDTO;
import com.example.demo.entity.Book;
import com.example.demo.service.ConsumerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
   private final ConsumerService consumerService;
   public ConsumerController(ConsumerService consumerService){
       this.consumerService= consumerService;
   }

    @GetMapping("/getConsumerById/{id}")
    public ResponseEntity<ConsumerDTO> getConsumer(@PathVariable("id") Integer id) {
        ConsumerDTO consumerDTO = consumerService.getConsumerById(id);
        return ResponseEntity.ok(consumerDTO);
    }/*

    @DeleteMapping("/deleteConsumer/{id}")
    public ResponseEntity<String> deleteConsumer(@PathVariable("id") Integer id){
        consumerService.deleteConsumer(id);
        return ResponseEntity.ok("consumer deleted");

    }

    @PutMapping("/updateComsumer/{id}")
    public ResponseEntity<CommsumerDTO> updateConsumer(@PathVariable("id") Integer id, @RequestBody ConsumerDTO consumerDTO){
        ConsumerDTO savedConsumer = consumerService.updateConsumer(id, consumerDTO);
       return ResponseEntity.ok(savedConsumer);
    }

    @PostMapping("/createConsumer")
    public ResponseEntity<ConsumerDTO> addConsumer(@RequestBody ConsumerDTO consumerDTO){
        ConsumerDTO savedConsumer= consumerService.addConsumer(consumerDTO);
        return ResponseEntity.ok(savedConsumer);
    }
*/
    @GetMapping("/findAll")
    public ResponseEntity<List<ConsumerDTO>> findAll(){
        List<ConsumerDTO> consumersDTO = consumerService.findAll();
        return ResponseEntity.ok(consumersDTO);
    }
}
