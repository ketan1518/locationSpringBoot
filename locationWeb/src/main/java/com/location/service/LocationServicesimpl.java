package com.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.location.entites.Location;
import com.location.repoes.LocationRepos;



@Service

public class LocationServicesimpl implements LocationService {

	@Autowired
	 private LocationRepos locationrepos;
	@Override
	public Location savelocation(Location location) {
		
		return locationrepos.save(location);
	
	}

	@Override
	public Location updatelocation(Location location) {
		
		return locationrepos.save(location);
		
	}

	@Override
	public void delectlocation(Location location) {
		locationrepos.delete(location);
		
	}

	@Override
	public Optional<Location> getlocationByid(int id) {
		
		return locationrepos.findById(id);
		
	}

	@Override
	public List<Location> getalllocation() {
		return locationrepos.findAll();
	}
	
	
}
