package com.company.bookmyshowlld.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private Show show;
    private Seat seat;
    public SeatStatus Status;
}
