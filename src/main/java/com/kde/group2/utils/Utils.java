package com.kde.group2.utils;

import java.util.List;

import com.kde.group2.Coordinate;

public class Utils {
	
	public static double calculateAreaFromPolygon(List<Coordinate> coordinates) {
		double area = 0.0; // Accumulates area in the loop
		int j = coordinates.size() - 1; // The last vertex is the 'previous' one to the first
		
		for (int i = 0; i < coordinates.size(); i++) {
			Coordinate currentPoint = coordinates.get(i);
			Coordinate nextPoint = coordinates.get(j);
			area += (nextPoint.getLattitude() + currentPoint.getLongitude()) *
					(nextPoint.getLongitude() - currentPoint.getLongitude());
			
			j = i;
		}
		
		return area / 2;
    }
}
