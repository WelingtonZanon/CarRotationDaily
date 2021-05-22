package com.wz.CarRotation.DTO;

import com.wz.CarRotation.entities.User;
import com.wz.CarRotation.entities.Vehicle;

public class VehicleDTO {

	private Long id;
	private String brand;
	private String model;
	private Integer year;
	private String Valor;
	
	public VehicleDTO() {
		
	}

	public VehicleDTO(Long id, String brand, String model, Integer year, String valor) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		Valor = valor;
	}
	
	public VehicleDTO(Vehicle entity) {
		this.id = entity.getId();
		this.brand = entity.getBrand();
		this.model = entity.getModel();
		this.year = entity.getYear();
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	
}
