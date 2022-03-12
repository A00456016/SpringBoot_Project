package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "guestList")
public class GuestList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int guestId;
    public String guestName;
    public String gender;

    public GuestList() {
    }

    public GuestList(int guestId, String guestName, String gender) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.gender = gender;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
