package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ParkingPlace;
import com.example.demo.model.ParkingSlot;
import com.example.demo.repository.ParkingSlotRepository;

@Service
public class ParkingSlotService {

    @Autowired
    private ParkingSlotRepository slotRepo;

    public List<ParkingSlot> getAvailableSlotsByPlace(ParkingPlace place) {
        return slotRepo.findByParkingPlaceAndIsAvailableTrue(place);
    }

    public ParkingSlot getSlotById(Integer id) {
        return slotRepo.findById(id).orElse(null);
    }

    public void updateSlot(ParkingSlot slot) {
        slotRepo.save(slot);
    }
}
