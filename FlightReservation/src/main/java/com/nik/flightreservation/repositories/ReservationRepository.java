package com.nik.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nik.flightreservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
