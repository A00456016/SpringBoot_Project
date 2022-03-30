package com.example.demo.repository;

import com.example.demo.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long>{
}