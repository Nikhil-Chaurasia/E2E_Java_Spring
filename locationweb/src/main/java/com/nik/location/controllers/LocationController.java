package com.nik.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nik.location.model.Location;
import com.nik.location.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location savedLocation = locationService.saveLocation(location);
		String successMessage = "Location saved with id - " +savedLocation.getId();
		modelMap.addAttribute("message", successMessage);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

}
