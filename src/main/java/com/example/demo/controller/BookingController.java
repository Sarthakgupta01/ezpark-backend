package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Booking;
import com.example.demo.service.BookingService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("bookings")
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking bookSlot(@RequestParam Integer id, @RequestParam String userName) {
        return bookingService.bookSlot(id, userName);
    }

    @GetMapping
    public List<Booking> getBookings(@RequestParam String userName) {
        return bookingService.getBookingsByUser(userName);
    }

}
