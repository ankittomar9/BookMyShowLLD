package com.company.bookmyshowlld.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel{
        private String name;
        private int email;
        private List<Booking>bookings;


}
