package com.location.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.entites.Location;
import com.location.repoes.LocationRepos;
import com.location.service.LocationService;
import com.location.util.EmailUtil;
import com.location.util.ReportUtil;

@Controller
public class LocationController {

	@Autowired
	private LocationService servie;

	@Autowired
	private EmailUtil emailutil;

	@Autowired

	private LocationRepos locationrepos;
	
	 @Autowired
	 private ReportUtil reportutil;
	 
	 
	 @Autowired
	 private ServletContext sc;
     
	@RequestMapping("/login")
	public String show() {
		return "create";
	}

	@RequestMapping("/savef")
	public String save(@ModelAttribute("location") Location location, ModelMap modelMap) {

		Location locationsaved = servie.savelocation(location);
		String msg = "location saveed id " + locationsaved.getId();
		modelMap.addAttribute("msg", msg);
		emailutil.sendEmail("@gmail.com", "location saved", "saved successfully...");

		return "create";

	}

	@RequestMapping("/display")

	public String displ(ModelMap modelMap) {
		List<Location> locations = servie.getalllocation();
		modelMap.addAttribute("displ", locations);
		return "displ";
	}

	@RequestMapping("/delectlocation")
	public String delect(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = new Location();
		location.setId(id);
		servie.delectlocation(location);
		List<Location> locations = servie.getalllocation();
		modelMap.addAttribute("locations", locations);
		return "displ";

	}

	@RequestMapping("/updatelocation")
	public String save(@RequestParam("id") int id, ModelMap modelMap) {
		Optional<Location> location = servie.getlocationByid(id);
		modelMap.addAttribute("location", location);

		return "editpage";

	}

	@RequestMapping("/updateloc")
	public String updatelocc(@ModelAttribute("location") Location location, ModelMap modelMap) {
		servie.updatelocation(location);

		List<Location> locations = servie.getalllocation();
		modelMap.addAttribute("locations", locations);
		return "displ";
	}
	
	@RequestMapping("/genratedReport")
	public String chart() {
		String path = sc.getRealPath("/");
		List<Object[]> data = locationrepos.findTypeAndTypeCount();
		reportutil.genratedPieChart(path, data);
		return "report";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
