package com.company.bookmyshowlld.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel {
    private int amount;
    private Date paymentDate;
    private String refNumber;
    private Booking booking;

    private PaymentMode paymentMode;
    private  PaymentGateway paymentGateway;
    private PaymentStatus paymentStatus;


}
