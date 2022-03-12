package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int guestId;
    private String hotelName;
    private String check_in;
    private String check_out;
    private ArrayList<GuestList> guestList;

    public Guest() {
    }

    public Guest(int guestId, String hotelName, String check_in, String check_out, ArrayList<GuestList> guestList) {
        this.guestId = guestId;
        this.hotelName = hotelName;
        this.check_in = check_in;
        this.check_out = check_out;
        this.guestList = guestList;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public ArrayList<GuestList> getGuestList() {
        return guestList;
    }

    public void setGuestList(ArrayList<GuestList> guestList) {
        this.guestList = guestList;
    }
}
