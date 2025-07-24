package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.City;
import com.example.demo.model.ParkingPlace;
import java.util.List;

@Repository
public interface ParkingPlaceRepository extends JpaRepository<ParkingPlace, Integer> {

    List<ParkingPlace> findByCity(City cityObj);
}
