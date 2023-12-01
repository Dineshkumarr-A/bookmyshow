package com.demo.bookmyshow.models;

import jakarta.persistence.OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String name;
    private String email;
    @OneToMany
    private List<Booking> bookings;
}
