package com.wz.CarRotation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wz.CarRotation.DTO.UserDTO;
import com.wz.CarRotation.entities.User;
import com.wz.CarRotation.repositories.UserRepository;
import com.wz.CarRotation.services.exceptions.ResourseNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	@Transactional(readOnly=true)
	public UserDTO findByID(Long id) {
		
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(()-> new ResourseNotFoundException("Cadastro não encontrado."));
		return new UserDTO(entity, entity.getVehicle());	
		
	}
	
	@Transactional
	public UserDTO insert(UserDTO dto) {
		User entity = new User();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setIdentity(dto.getIdentity());
		entity.setBirthDate(dto.getBirthDate());		
		entity = repository.save(entity);
		return new UserDTO(entity);
	}
}
