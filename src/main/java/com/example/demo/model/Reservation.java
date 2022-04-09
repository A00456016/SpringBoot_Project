package com.example.demo.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long guestId;
    private String hotelName;
    private String check_in;
    private String check_out;
    @OneToMany(targetEntity = Guest.class)
    private List<Guest> guest;

    public Reservation() {
    }

    public Reservation(Long guestId, String hotelName, String check_in, String check_out, List<Guest> guest) {
        this.guestId = guestId;
        this.hotelName = hotelName;
        this.check_in = check_in;
        this.check_out = check_out;
        this.guest = guest;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
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

    public List<Guest> getGuestList() {
        return this.guest;
    }

    public void setGuestList(List<Guest> guest) {
        this.guest = guest;
    }
}
