package com.nik.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nik.location.model.Location;
import com.nik.location.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		Optional<Location> optionalLocation = locationRepository.findById(id);
		return optionalLocation.get();
	}

	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

	@Override
	public List<Object[]> generateReportByType() {
		return locationRepository.findTypeAndTypeCount();
	}

}
