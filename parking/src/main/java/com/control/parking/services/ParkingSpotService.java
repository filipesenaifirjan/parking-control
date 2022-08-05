package com.control.parking.services;

import org.springframework.stereotype.Service;

import com.control.parking.repositories.ParkingSpotRepository;

@Service

public class ParkingSpotService {
	
	final ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}
	

}
