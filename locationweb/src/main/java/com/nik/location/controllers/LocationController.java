package com.nik.location.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nik.location.model.Location;
import com.nik.location.service.LocationService;
import com.nik.location.utilities.EmailUtility;
import com.nik.location.utilities.ReportUtility;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private EmailUtility emailUtility;

	@Autowired
	private ReportUtility reportUtility;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location savedLocation = locationService.saveLocation(location);
		String successMessage = "Location saved with id - " + savedLocation.getId();
		modelMap.addAttribute("message", successMessage);
		emailUtility.sendEmail("abc@gmail.com", "Location saved",
				"Location with id - " + savedLocation.getId() + " saved in the database");
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("/generateReport")
	public String generateReport() {
		String path = servletContext.getRealPath("/");
		List<Object[]> data = locationService.generateReportByType();
		reportUtility.generatePieChart(path, data);
		return "report";
	}

}
