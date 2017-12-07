package com.kde.group2.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.kde.group2.Coordinate;
import com.kde.group2.variables.AccommodationType;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="id")
@JsonInclude(Include.NON_NULL)
public class ResultsDto {
	
	private String county;
	
	private Double area;
	
	private Integer persons;
	
	private String countyResource;
	
	private Integer households;
	
	private List<Coordinate> coordinates;
	
	private AccommodationType accommodationType;
	
	public ResultsDto() {
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Integer getPersons() {
		return persons;
	}

	public void setPersons(Integer persons) {
		this.persons = persons;
	}

	public String getCountyResource() {
		return countyResource;
	}

	public void setCountyResource(String countyResource) {
		this.countyResource = countyResource;
	}

	public Integer getHouseholds() {
		return households;
	}

	public void setHouseholds(Integer households) {
		this.households = households;
	}

	public AccommodationType getAccommodationType() {
		return accommodationType;
	}

	public void setAccommodationType(AccommodationType accommodationType) {
		this.accommodationType = accommodationType;
	}

	public List<Coordinate> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Coordinate> coordinates) {
		this.coordinates = coordinates;
	}
	
}
