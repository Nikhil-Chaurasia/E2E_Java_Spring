package com.nik.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nik.location.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query("select type,count(type) from Location group by type")
	List<Object[]> findTypeAndTypeCount();

}
