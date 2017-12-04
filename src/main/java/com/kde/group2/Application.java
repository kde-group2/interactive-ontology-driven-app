package com.kde.group2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kde.group2.model.HousingModel;
import com.kde.group2.variables.AccommodationType;
import com.kde.group2.variables.County;

@SpringBootApplication
public class Application {

	static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		
		SpringApplication.run(Application.class, args);
		logger.info("Spring application initialized and started.");
		
		HousingModel model = new HousingModel();

		model.getHouseholdsAndPersonsByType(AccommodationType.BEDSIT);
		model.getHouseholdsAndPersonsByCountyAndType(County.CORK, AccommodationType.CARAVAN_MOBILE_HOME);
		model.getHouseholdsByCountyAndType(County.WICKLOW, AccommodationType.FLAT_APARTMENT);
		model.getPersonsByCountyAndType(County.WESTMEATH, AccommodationType.NOT_STATED);
		model.getPersonsByCounty(County.CARLOW);
		model.getHouseholdsByCounty(County.CLARE);
		model.getPersonsByType(AccommodationType.ALL);
		model.getHouseholdsByType(AccommodationType.HOUSE_BUNGALOW);
		model.getHouseholdsGreaterThanXByType(AccommodationType.HOUSE_BUNGALOW, 50000);
	}
}
