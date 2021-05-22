package com.wz.CarRotation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.services.exceptions.ResourseNotFoundException;
import com.wz.CarRotation.DTO.UserDTO;
import com.wz.CarRotation.entities.User;
import com.wz.CarRotation.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	@Transactional(readOnly=true)
	public UserDTO findByID(Long id) {
		
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(()-> new ResourseNotFoundException("Entity not found"));
		return new UserDTO(entity, entity.getVehicle());	
		
	}
}
