package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ParkingPlace;
import com.example.demo.model.ParkingSlot;

@Repository
public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Integer> {
    List<ParkingSlot> findByParkingPlaceAndIsAvailableTrue(ParkingPlace place);
}
