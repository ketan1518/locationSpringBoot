package com.location.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entites.Location;
import com.location.repoes.LocationRepos;

@RestController
@RequestMapping("/location")
public class LocationRESTController {
	
	@Autowired
	LocationRepos locationrepos;
	
	@GetMapping
	public List<Location> getall() {
		
		return locationrepos.findAll();
	}

	
	@PostMapping
	public Location createlocation(@RequestBody Location location) {
		return locationrepos.save(location);
	}
	
	
	@PutMapping
	public Location updatelocatrion(@RequestBody Location location) {
		
		return locationrepos.save(location);
	}
	
	@DeleteMapping("/{id}")
	public void deletlocation(@PathVariable("id") int id)
	{
		locationrepos.deleteById(id);
		
	}
	
	@GetMapping("/{id}")
	public Optional<Location> getone(@PathVariable("id") int id) {
		
		return locationrepos.findById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
