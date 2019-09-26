package com.nik.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nik.location.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
