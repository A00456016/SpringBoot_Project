package com.example.demo.service;

import com.example.demo.model.Reservation;
import com.example.demo.model.Guest;
import com.example.demo.model.Hotel;
import com.example.demo.repository.GuestRepository;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    private ReservationRepository reservationRepository;
    @Autowired
    private GuestRepository guestRepository;

    @Transactional
    public String addGuest(Reservation reservation){
        Reservation newReservation = new Reservation();
        newReservation.setHotelName(reservation.getHotelName());
        newReservation.setCheck_in(reservation.getCheck_in());
        newReservation.setCheck_out(reservation.getCheck_out());

       for(int i = 0; i< reservation.getGuestList().size(); i++) {
           Guest savedGuest = guestRepository.save(reservation.getGuestList().get(i));
           if (!guestRepository.findById(savedGuest.getId()).isPresent())

               return "Failed creating guestlist";
        }
        Reservation savedReservation = reservationRepository.save(newReservation);
        if(reservationRepository.findById(savedReservation.getGuestId()).isPresent()){
            StringBuilder date = new StringBuilder(savedReservation.getCheck_in());
            date.deleteCharAt(5);
            date.deleteCharAt(2);
            String confirmation = date.toString() + savedReservation.getGuestId().toString();
            return confirmation;
        }else
        {
            return "Failed creating guestlist";
        }
    }
}
