package com.wz.CarRotation.DTO;

import javax.validation.constraints.NotBlank;

import com.wz.CarRotation.entities.Vehicle;

public class InsertVehicleDTO {

	private Long id;
	
	@NotBlank (message = "Campo obrigatório")
	private String brand;
	
	@NotBlank (message = "Campo obrigatório")
	private String model;
	
	@NotBlank (message = "Campo obrigatório")
	private String year;
	
	private Long userId;

	public InsertVehicleDTO() {
		
	}

	public InsertVehicleDTO(Long id, String brand, String model, String year, Long userId) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.userId = userId;
	}
	
	public InsertVehicleDTO(Vehicle entity) {
		this.id = entity.getId();
		this.brand = entity.getBrand();
		this.model = entity.getModel();
		this.year = entity.getYear();
		this.userId = entity.getUser().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
