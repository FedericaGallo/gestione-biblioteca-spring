package com.example.demo.repository;

import com.example.demo.entity.Lending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LendingRepository extends JpaRepository<Lending, Integer> {
}
