package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Booking;
import com.example.demo.model.ParkingSlot;
import com.example.demo.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepo;

    @Autowired
    private ParkingSlotService slotService;

    public Booking bookSlot(Integer slotId, String userName) {
        ParkingSlot slot = slotService.getSlotById(slotId);

        // Don't proceed if already booked
        if (slot == null || !slot.isAvailable()) {
            return null;
        }

        // Mark slot as booked
        slot.setAvailable(false);
        slotService.updateSlot(slot);

        Booking booking = new Booking();
        booking.setSlot(slot);
        booking.setUserName(userName);
        booking.setStartTime(LocalDateTime.now());
        booking.setEndTime(null); // Can be updated later

        return bookingRepo.save(booking);
    }

    public List<Booking> getBookingsByUser(String userName) {
        return bookingRepo.findByUserName(userName);
    }
}
