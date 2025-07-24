package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepo;

    public List<City> getAllCity() {

        return cityRepo.findAll();
    }

    public City getCityByName(String city) {

        return cityRepo.findByNameIgnoreCase(city);
    }

}
