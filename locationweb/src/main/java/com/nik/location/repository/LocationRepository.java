package com.nik.location.repository;

import org.springframework.data.repository.CrudRepository;

import com.nik.location.model.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
