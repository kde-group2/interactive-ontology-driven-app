package com.kde.group2.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kde.group2.model.HousingModel;
import com.kde.group2.variables.AccommodationType;

@RestController
@RequestMapping(path = "/v1/model/housing")
public class HousingModelController {

	@Autowired
	HousingModel housingModel;
	
	@RequestMapping(method = RequestMethod.GET, path= "/household/persons/byaccomodation/type", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<HashMap<String, Object>>> getHouseholdsAndPersonsByAccomodationType(@RequestParam("type") String type) {
		
		AccommodationType accomodationType = AccommodationType.valueOf(type);
		List<HashMap<String, Object>> resultSet = housingModel.getHouseholdsAndPersonsByType(accomodationType);
		return resultSet;
	}
}
