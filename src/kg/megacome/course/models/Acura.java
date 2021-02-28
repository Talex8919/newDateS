package kg.megacome.course.models;

import kg.megacome.course.enumPackage.TypeOfCar;

import java.time.Period;
import java.time.ZonedDateTime;

public class Acura  extends Car {

    private TypeOfCar typeOfAcura;

    public Acura(String model, ZonedDateTime year, int carCost, String country, Period warranty, boolean isHybrid, String color, TypeOfCar typeOfAcura) {
        super(model, year, carCost, country, warranty, isHybrid, color);
        this.typeOfAcura = typeOfAcura;
    }

    public Acura(TypeOfCar typeOfAcura) {
        this.typeOfAcura = typeOfAcura;
    }

    public TypeOfCar getTypeOfAcura() {
        return typeOfAcura;
    }

    public void setTypeOfAcura(TypeOfCar typeOfAcura) {
        this.typeOfAcura = typeOfAcura;
    }

    @Override
    public Object isHybrid() {
        return null;
    }
}
