package kg.megacome.course.models;

import kg.megacome.course.enumPackage.TypeOfCar;


import java.time.Period;
import java.time.ZonedDateTime;

public class Toyota extends Car {

    private TypeOfCar enumTypeToyota;


    public TypeOfCar getEnumTypeToyota() {
        return enumTypeToyota;
    }

    public void setEnumTypeToyota(TypeOfCar enumTypeToyota) {
        this.enumTypeToyota = enumTypeToyota;
    }

    public Toyota(String model, ZonedDateTime year, int carCost, String country, Period warranty, boolean isHybrid, String color, TypeOfCar enumTypeToyota) {
        super(model, year, carCost, country, warranty, isHybrid, color);
        this.enumTypeToyota = enumTypeToyota;
    }

    public Toyota(TypeOfCar enumTypeToyota) {
        this.enumTypeToyota = enumTypeToyota;
    }


    @Override
    public Object isHybrid() {
        return null;
    }
}
