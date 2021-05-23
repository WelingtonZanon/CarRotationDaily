package com.wz.CarRotation.DTO;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.wz.CarRotation.entities.User;
import com.wz.CarRotation.entities.Vehicle;
import com.wz.CarRotation.service.validation.UserInsertValid;

@UserInsertValid
public class UserDTO {
	
	
	private Long id;
	
	@NotBlank (message = "Campo obrigatório")
	private String name;
	
	@NotBlank (message = "Campo obrigatório")
	private String email;
	
	@NotBlank (message = "Campo obrigatório")
	private String identity;
	
	@NotNull (message = "Campo obrigatório")
	private Instant birthDate;
	
	
	private List<VehicleDTO> vehicle = new ArrayList<>();
	
	public UserDTO() {
		
	}

	public UserDTO(Long id, String name, String email, String identity, Instant birthDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.identity = identity;
		this.birthDate = birthDate;
	}
	
	public UserDTO(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.identity = entity.getIdentity();
		this.birthDate = entity.getBirthDate();
	}
	
	public UserDTO(User entity, List<Vehicle> vehicle) {
		this(entity);
		vehicle.forEach(x -> this.vehicle.add(new VehicleDTO(x)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public List<VehicleDTO> getVehicle() {
		return vehicle;
	}		

	
}
