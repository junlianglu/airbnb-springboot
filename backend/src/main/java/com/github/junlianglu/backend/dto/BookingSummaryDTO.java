package com.github.junlianglu.backend.dto;

import com.github.junlianglu.backend.model.Booking;

import java.util.Date;

public class BookingSummaryDTO {
    private String id;
    private Date checkInDate;
    private Date checkOutDate;

    public BookingSummaryDTO(Booking booking) {
        this.id = booking.getId();
        this.checkInDate = booking.getCheckInDate();
        this.checkOutDate = booking.getCheckOutDate();
    }

    // getters
}
