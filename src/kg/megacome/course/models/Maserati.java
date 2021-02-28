package kg.megacome.course.models;

import kg.megacome.course.enums.TypeOfCar;

import java.time.*;

public class Maserati extends Car {
    private TypeOfCar typeOfMaserati;
private String dayOfManufactured;
    private Period warranty1;
    private LocalTime timeWhenItCrafted;
    private LocalDateTime timeWasInBranch;
    private ZonedDateTime whereItIs;
    private ZoneId location;

    public TypeOfCar getTypeOfMaserati() {
        return typeOfMaserati;
    }

    public void setTypeOfMaserati(TypeOfCar typeOfMaserati) {
        this.typeOfMaserati = typeOfMaserati;
    }

    public String getDayOfManufactured() {
        return dayOfManufactured;
    }

    public void setDayOfManufactured(String dayOfManufactured) {
        this.dayOfManufactured = dayOfManufactured;
    }

    public Period getWarranty1() {
        return warranty1;
    }

    public void setWarranty1(Period warranty1) {
        this.warranty1 = warranty1;
    }

    public LocalTime getTimeWhenItCrafted() {
        return timeWhenItCrafted;
    }

    public void setTimeWhenItCrafted(LocalTime timeWhenItCrafted) {
        this.timeWhenItCrafted = timeWhenItCrafted;
    }

    public LocalDateTime getTimeWasInBranch() {
        return timeWasInBranch;
    }

    public void setTimeWasInBranch(LocalDateTime timeWasInBranch) {
        this.timeWasInBranch = timeWasInBranch;
    }

    public ZonedDateTime getWhereItIs() {
        return whereItIs;
    }

    public void setWhereItIs(ZonedDateTime whereItIs) {
        this.whereItIs = whereItIs;
    }

    public ZoneId getLocation() {
        return location;
    }

    public void setLocation(ZoneId location) {
        this.location = location;
    }

    public Maserati(TypeOfCar typeOfMaserati, String dayOfManufactured, Period warranty1, LocalTime timeWhenItCrafted, LocalDateTime timeWasInBranch, ZonedDateTime whereItIs, ZoneId location) {
        this.typeOfMaserati = typeOfMaserati;
        this.dayOfManufactured = dayOfManufactured;
        this.warranty1 = warranty1;
        this.timeWhenItCrafted = timeWhenItCrafted;
        this.timeWasInBranch = timeWasInBranch;
        this.whereItIs = whereItIs;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Maserati{" +
                "typeOfMaserati=" + typeOfMaserati +
                ", dayOfManufactured=" + dayOfManufactured +
                ", warranty1=" + warranty1 +
                ", timeWhenItCrafted=" + timeWhenItCrafted +
                ", timeWasInBranch=" + timeWasInBranch +
                ", whereItIs=" + whereItIs +
                ", location=" + location +
                '}';
    }

    @Override
    public Object isHybrid() {
            return null;
    }
}
