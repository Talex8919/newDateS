package kg.megacome.course.models;

import kg.megacome.course.enums.TypeOfCar;

import java.time.Period;
import java.time.ZonedDateTime;

public class Bmw extends Car {
    private TypeOfCar typeOfBmw;

    public Bmw(String model, ZonedDateTime year, int carCost, String country, Period warranty, boolean isHybrid, String color, TypeOfCar typeOfBmw) {
        super(model, year, carCost, country, warranty, isHybrid, color);
        this.typeOfBmw = typeOfBmw;
    }

    public TypeOfCar getTypeOfBmw() {
        return typeOfBmw;
    }

    public void setTypeOfBmw(TypeOfCar typeOfBmw) {
        this.typeOfBmw = typeOfBmw;
    }

    @Override
    public Object isHybrid() {
        return null;
    }
}
