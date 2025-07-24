package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("cities")
@CrossOrigin("*")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/getAll")
    public List<City> getAllCity() {

        return cityService.getAllCity();
    }
}
