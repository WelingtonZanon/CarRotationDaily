package com.wz.CarRotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wz.CarRotation.DTO.InsertVehicleDTO;
import com.wz.CarRotation.entities.User;
import com.wz.CarRotation.entities.Vehicle;
import com.wz.CarRotation.repositories.UserRepository;
import com.wz.CarRotation.repositories.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository repository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Transactional
	public InsertVehicleDTO insert(InsertVehicleDTO dto) {
		Vehicle entity = new Vehicle();
		entity.setBrand(dto.getBrand());
		entity.setModel(dto.getModel());
		entity.setYear(dto.getYear());
		
		User user = userRepository.getOne(dto.getUserId());
		
		entity.setUser(user);	
		
		entity = repository.save(entity);
		return new InsertVehicleDTO(entity);
	}
}
