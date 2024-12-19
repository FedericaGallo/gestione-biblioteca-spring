package com.example.demo.controller;

import com.example.demo.DTO.LendingDTO;
import com.example.demo.service.LendingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lending")
public class LendingController {
    private final LendingService lendingService;
    public LendingController(LendingService lendingService){
        this.lendingService = lendingService;
    }
    @GetMapping("/getLendingById/{id}")
    public ResponseEntity<LendingDTO> getLending(@PathVariable("id") Integer id) {
        LendingDTO lendingDTO = lendingService.getLendingById(id);
        return ResponseEntity.ok(lendingDTO);
    }

    @DeleteMapping("/deleteLending/{id}")
    public ResponseEntity<String> deleteLending(@PathVariable("id") Integer id) {
        lendingService.deleteLending(id);
        return ResponseEntity.ok("lending deleted");

    }

    @PutMapping("/updateComsumer/{id}")
    public ResponseEntity<LendingDTO> updateLending(@PathVariable("id") Integer id, @RequestBody LendingDTO lendingDTO) {
        LendingDTO savedLending = lendingService.updateLending(id, lendingDTO);
        return ResponseEntity.ok(savedLending);
    }

    @PostMapping("/createLending")
    public ResponseEntity<LendingDTO> addLending(@RequestBody LendingDTO lendingDTO){
        LendingDTO savedLending= lendingService.addLending(lendingDTO);
        return ResponseEntity.ok(savedLending);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<LendingDTO>> findAll() {
        List<LendingDTO> lendingsDTO = lendingService.findAll();
        return ResponseEntity.ok(lendingsDTO);
    }
    
}
