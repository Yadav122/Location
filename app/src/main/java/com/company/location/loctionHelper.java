package com.company.location;

public class loctionHelper {
    private  double Longtitude ;
    private double latitude ;

    public loctionHelper(double longtitude, double latitude) {
        Longtitude = longtitude;
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return Longtitude;
    }

    public void setLongtitude(double longtitude) {
        Longtitude = longtitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
