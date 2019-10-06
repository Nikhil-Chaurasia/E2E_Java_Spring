package com.nik.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nik.flightreservation.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
