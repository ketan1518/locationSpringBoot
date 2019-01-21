package com.location.service;

import java.util.List;
import java.util.Optional;

import com.location.entites.Location;

public interface LocationService {

	Location savelocation(Location location);

	Location updatelocation(Location location);

	void delectlocation(Location location);

	Optional<Location> getlocationByid(int id);

	List<Location> getalllocation();

}
