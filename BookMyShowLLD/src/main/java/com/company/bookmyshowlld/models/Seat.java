package com.company.bookmyshowlld.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel {
    private int seatNumber;
    private int row;
    private int col;
    private SeatType seatType;


}
