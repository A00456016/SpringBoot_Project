package com.example.demo.controller;

import com.example.demo.model.Guest;
import com.example.demo.model.Hotel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/hotels")
public class Controller {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<Hotel> listHotel() {
        return userService.listAllHotel();
    }

    @PostMapping("/guests")
    public void add(@RequestBody Guest guest) {
        userService.saveGuest(guest);
    }

}