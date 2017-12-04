package com.kde.group2;

import com.kde.group2.model.HousingModel;
import com.kde.group2.variables.AccommodationType;
import com.kde.group2.variables.County;

public class Application {


	public static void main(String args[]) {
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
