package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ParkingPlace;
import com.example.demo.model.ParkingSlot;
import com.example.demo.service.ParkingPlaceService;
import com.example.demo.service.ParkingSlotService;

@RestController
@RequestMapping("/parking-places")
@CrossOrigin("*")
public class ParkingSlotController {

    @Autowired
    private ParkingPlaceService placeService;

    @Autowired
    private ParkingSlotService slotService;

    @GetMapping("/{placeId}/slots")
    public List<ParkingSlot> getSlots(@PathVariable Integer placeId) {
        ParkingPlace place = placeService.getPlaceById(placeId);
        return slotService.getAvailableSlotsByPlace(place);
    }
}
