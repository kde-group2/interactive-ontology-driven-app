package com.kde.group2;

public class Coordinate {

    private double lattitude;
    private double longitude;

    public Coordinate(double lattitude, double longitude) {
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public double getLattitude() {
        return this.lattitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
}
