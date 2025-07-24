package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.model.ParkingPlace;
import com.example.demo.service.CityService;
import com.example.demo.service.ParkingPlaceService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("parking-places/")
@CrossOrigin("*")
public class ParkingPlaceController {

    @Autowired
    private CityService cityService;

    @Autowired
    private ParkingPlaceService parkingPlaceService;

    @GetMapping
    public List<ParkingPlace> getPlaceByCity(@RequestParam String city) {

        City cityObj = cityService.getCityByName(city);

        return parkingPlaceService.getPlaceByCity(cityObj);
    }

}
