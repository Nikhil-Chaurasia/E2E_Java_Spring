package com.nik.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nik.flightreservation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
