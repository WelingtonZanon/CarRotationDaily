package com.wz.CarRotation.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wz.CarRotation.DTO.InsertVehicleDTO;
import com.wz.CarRotation.services.VehicleService;

@RestController
@RequestMapping(value="/vehicle")
public class VehicleResource {
	
	@Autowired
	private VehicleService service;
	
	@PostMapping
	public ResponseEntity<InsertVehicleDTO> insert(@Valid @RequestBody InsertVehicleDTO dto) {
		dto = service.insert(dto);
		return ResponseEntity.ok(dto);
	}
}
