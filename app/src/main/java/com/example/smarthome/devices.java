package com.example.smarthome;

public class devices {
    private int resource;
    private String name;
    private double index;

    public devices(int resource, String name,double index) {
        this.resource = resource;
        this.name = name;
        this.index = index;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
