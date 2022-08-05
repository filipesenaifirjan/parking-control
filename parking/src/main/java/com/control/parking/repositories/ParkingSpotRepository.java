package com.control.parking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.control.parking.models.ParkingSpotModel;


	import java.util.UUID;

	@Repository
	public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

	    boolean existsByLicensePlateCar(String licensePlateCar);
	    boolean existsByParkingSpotNumber(String parkingSpotNumber);
	    boolean existsByApartmentAndBlock(String apartment, String block);
	}
	

