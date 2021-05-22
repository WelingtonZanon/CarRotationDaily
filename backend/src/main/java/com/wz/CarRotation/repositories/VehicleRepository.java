package com.wz.CarRotation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wz.CarRotation.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	
}
