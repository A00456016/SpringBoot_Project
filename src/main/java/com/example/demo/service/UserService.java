package com.example.demo.service;

import com.example.demo.model.Guest;
import com.example.demo.model.GuestList;
import com.example.demo.model.Hotel;
import com.example.demo.repository.GuestListRepository;
import com.example.demo.repository.GuestRepository;
import com.example.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private HotelRepository hotelRepository;
    public List<Hotel> listAllHotel() {
        return hotelRepository.findAll();
    }
    @Autowired
    private GuestRepository guestRepository;
    @Autowired
    private GuestListRepository guestListRepository;

    @Transactional
    public ResponseEntity<Object> addGuest(Guest guest){
        Guest newGuest = new Guest();
        newGuest.setHotelName(guest.getHotelName());
        newGuest.setCheck_in(guest.getCheck_in());
        newGuest.setCheck_out(guest.getCheck_out());

       for(int i=0; i<guest.getGuestList().size(); i++) {
           GuestList savedGuestList = guestListRepository.save(guest.getGuestList().get(i));
           if (!guestListRepository.findById(savedGuestList.getId()).isPresent())
               return ResponseEntity.unprocessableEntity().body("Failed creating guestlist");
        }

        /* newGuest.setGuestList(guest.getGuestList()); */
        Guest savedGuest = guestRepository.save(newGuest);
        if(guestRepository.findById(savedGuest.getGuestId()).isPresent()){
            return ResponseEntity.accepted().body("Successfully created guest");
        }else
        {
            return ResponseEntity.unprocessableEntity().body("Failed to Create guest");
        }
    }
}
