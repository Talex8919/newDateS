package kg.megacome.course.models;

import java.time.Period;
import java.time.ZonedDateTime;

public abstract class Car {
    private String model;
    private ZonedDateTime year;
    private int carCost;
    private String country;
    private Period warranty;
boolean isHybrid;
private String color;

    public Car(String model, ZonedDateTime year, int carCost, String country, Period warranty, boolean isHybrid, String color) {
        this.model = model;
        this.year = year;
        this.carCost = carCost;
        this.country = country;
        this.warranty = warranty;
        this.isHybrid = isHybrid;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ZonedDateTime getYear() {
        return year;
    }

    public void setYear(ZonedDateTime year) {
        this.year = year;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Period getWarranty() {
        return warranty;
    }

    public void setWarranty(Period warranty) {
        this.warranty = warranty;
    }

    public boolean isHybrid(boolean b) {
        return isHybrid;
    }

    public void setHybrid(boolean hybrid) {
        isHybrid = hybrid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(){
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", carCost=" + carCost +
                ", country='" + country + '\'' +
                ", warranty=" + warranty +
                ", isHybrid=" + isHybrid +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract Object isHybrid();
}



