package com.nik.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nik.flightreservation.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
