package com.example.demo.repository;

import com.example.demo.model.GuestList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Repository
public interface GuestListRepository extends JpaRepository<GuestList, Long>{
}