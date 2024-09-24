package com.company.bookmyshowlld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {

    //Booking 1: 1 User
    //Booking M : 1 User
    @ManyToOne
    private User bookedBy;
    private Date bookedAt;
    @ManyToMany
    private List<ShowSeat> seats;
    private List<Payment> payments;

    private int amount;
    private BookingStatus bookingStatus;

}

//1 Booking can have multipl showSeats  : at max 10:
// 1 showSeat can also present in multiple bookings cancelled booking
