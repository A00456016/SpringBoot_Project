package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long id;
    public String guestName;
    public String gender;

    public Guest() {
    }

    public Guest(Long id, String guestName, String gender) {
        this.id = id;
        this.guestName = guestName;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
