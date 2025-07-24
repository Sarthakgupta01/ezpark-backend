package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.model.ParkingPlace;
import com.example.demo.repository.ParkingPlaceRepository;

@Service
public class ParkingPlaceService {

    @Autowired
    private ParkingPlaceRepository parkingPlaceRepository;

    public List<ParkingPlace> getPlaceByCity(City cityObj) {
        return parkingPlaceRepository.findByCity(cityObj);

    }

    public ParkingPlace getPlaceById(Integer id) {
        return parkingPlaceRepository.findById(id).orElse(null);
    }

}
