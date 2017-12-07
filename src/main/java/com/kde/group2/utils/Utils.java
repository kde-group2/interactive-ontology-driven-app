package com.kde.group2.utils;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.kde.group2.Coordinate;

public class Utils {
	
	public static double calculateAreaFromPolygon(List<Coordinate> coordinates) {
		double area = 0.0; // Accumulates area in the loop
		int j = coordinates.size() - 1; // The last vertex is the 'previous' one to the first
		
		for (int i = 0; i < coordinates.size(); i++) {
			Coordinate currentPoint = coordinates.get(i);
			Coordinate nextPoint = coordinates.get(j);
			area += (nextPoint.getLatitude() + currentPoint.getLongitude()) *
					(nextPoint.getLongitude() - currentPoint.getLongitude());
			
			j = i;
		}
		
		return area / 2;
    }
	
	public static String createErrorResponseMessage(String message) {
		JsonObject obj = new JsonObject();
		obj.addProperty("error", message);
		return new Gson().toJson(obj);
	}
}
