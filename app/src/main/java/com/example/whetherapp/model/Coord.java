package com.example.whetherapp.model;

public class Coord {
    public float lon ;
    public float lat;

    public Coord() {
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "["+lat+","+lon+"]";
    }
}
