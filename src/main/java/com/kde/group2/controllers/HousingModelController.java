package com.kde.group2.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kde.group2.Coordinate;
import com.kde.group2.dto.ResultsDto;
import com.kde.group2.model.HousingModel;
import com.kde.group2.utils.JsonUtils;
import com.kde.group2.variables.AccommodationType;
import com.kde.group2.variables.County;

@CrossOrigin()
@RestController
@RequestMapping(path = "/v1/model/housing")
public class HousingModelController {

	Logger logger = LoggerFactory.getLogger(HousingModelController.class);
	
	@Autowired
	HousingModel housingModel;
	
	@Autowired
	JsonUtils jsonUtils;
	
	@RequestMapping(method = RequestMethod.GET, path= "/household/persons/byacctype", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getHouseholdsAndPersonsByAccommodationType(@RequestParam(value = "acctype", required= true) AccommodationType acctype) {
		
		logger.info("Request for getHouseholdsAndPersonsByType() received for accommodation type: "+acctype);
		
		List<HashMap<String, Object>> resultSet = housingModel.getHouseholdsAndPersonsByType(acctype);
		
		List<ResultsDto> formattedResult = new ArrayList<ResultsDto>();
		
		for (HashMap<String, Object> result : resultSet) {
			Double area = (Double)result.get("area");
			Integer persons = (Integer)result.get("persons");
			String countyResource = ""+result.get("countyResource");
			String county = ""+result.get("county");
			Integer households = (Integer)result.get("households");
			List<Coordinate> coordinates = (List<Coordinate>) result.get("coordinates");
			
			ResultsDto dto = new ResultsDto();
			dto.setArea(area);
			dto.setPersons(persons);
			dto.setCountyResource(countyResource);
			dto.setCounty(county);
			dto.setHouseholds(households);
			dto.setCoordinates(coordinates);
			
			formattedResult.add(dto);
		}
		ResponseEntity<String> response = jsonUtils.getJsonForResponse(formattedResult);
		logger.info("Request for getHouseholdsAndPersonsByType() processed successfully.");
		
		return response;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path= "/household/persons/bycounty/byacctype", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getHouseholdsAndPersonsByCountyAndType(@RequestParam(value = "county", required= true) County cty, 
			@RequestParam(value = "acctype", required= true) AccommodationType acctype) {
		
		logger.info("Request for getHouseholdsAndPersonsByCountyAndType() received for accommodation type: "+acctype);
		
		List<HashMap<String, Object>> resultSet = housingModel.getHouseholdsAndPersonsByCountyAndType(cty, acctype);
		
		List<ResultsDto> formattedResult = new ArrayList<ResultsDto>();
		
		for (HashMap<String, Object> result : resultSet) {
			Double area = (Double)result.get("area");
			Integer persons = (Integer)result.get("persons");
			String countyResource = ""+result.get("countyResource");
			Integer households = (Integer)result.get("households");
			List<Coordinate> coordinates = (List<Coordinate>) result.get("coordinates");
			
			ResultsDto dto = new ResultsDto();
			dto.setArea(area);
			dto.setPersons(persons);
			dto.setCountyResource(countyResource);
			dto.setHouseholds(households);
			dto.setCoordinates(coordinates);
			
			formattedResult.add(dto);
		}
		ResponseEntity<String> response = jsonUtils.getJsonForResponse(formattedResult);
		logger.info("Request for getHouseholdsAndPersonsByCountyAndType() processed successfully.");
		
		return response;
	}
	
}
