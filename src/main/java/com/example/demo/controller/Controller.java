package com.example.demo.controller;

import com.example.demo.model.Reservation;
import com.example.demo.model.Hotel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    UserService userService;

    @GetMapping("/hotels")
    public List<Hotel> listHotel() {
        return userService.listAllHotel();
    }

    @PostMapping("/guests")
    public /*ResponseEntity<Object>*/ String createGuest(@RequestBody Reservation reservation){
        return userService.addGuest(reservation);
    }
}