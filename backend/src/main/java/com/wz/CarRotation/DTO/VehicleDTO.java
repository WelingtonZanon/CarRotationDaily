package com.wz.CarRotation.DTO;

import java.util.Calendar;

import com.wz.CarRotation.entities.User;
import com.wz.CarRotation.entities.Vehicle;

public class VehicleDTO {

	private Long id;
	private String brand;
	private String model;
	private String year;
	private String Valor;
	
	private String weekDay;
	private boolean active = false;
	
	public VehicleDTO() {
		
	}

	public VehicleDTO(Long id, String brand, String model, String year, String valor, User user) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.Valor = valor;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}
	
	
	public boolean isActive() {
		return active;
	}

	public String getWeekDay() {
		Calendar calendar = Calendar.getInstance();
		switch (Integer.parseInt(year.substring(3, 4))) {
		case 0:case 1:			
			weekDay = "segunda-feira";
			if(2==calendar.get(Calendar.DAY_OF_WEEK)) active=true;
			break;			
		case 2:case 3:			
			weekDay = "terça-feira";
			if(3==calendar.get(Calendar.DAY_OF_WEEK)) active=true;
			break;	
		case 4:case 5:			
			weekDay = "quarta-feira";
			if(4==calendar.get(Calendar.DAY_OF_WEEK)) active=true;
			break;
		case 6:case 7:			
			weekDay = "quinta-feira";
			if(5==calendar.get(Calendar.DAY_OF_WEEK)) active=true;
			break;
		case 8:case 9:			
			weekDay = "sexta-feira";
			if(6==calendar.get(Calendar.DAY_OF_WEEK)) active=true;
			break;
		}
		return weekDay;
	}
	
}
