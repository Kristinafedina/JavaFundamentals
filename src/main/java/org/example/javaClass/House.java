package org.example.javaClass;

import java.util.List;

public class House {

    private int houseId;
    private int apartmentNumber;
    private double square;
    private int floor;
    private int roomsNumber;
    private String street;
    private String typeOfBuilding;
    private int lifetime;

    public House(int houseId, int apartmentNumber, double square,
                 int floor, int roomsNumber, String street, String typeOfBuilding,
                 int lifetime) {
        this.houseId = houseId;
        this.apartmentNumber = apartmentNumber;
        this.square = square;
        this.floor = floor;
        this.roomsNumber = roomsNumber;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.lifetime = lifetime;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseId=" + houseId +
                ", apartmentNumber=" + apartmentNumber +
                ", square=" + square +
                ", floor=" + floor +
                ", roomsNumber=" + roomsNumber +
                ", street='" + street + '\'' +
                ", typeOfBuilding='" + typeOfBuilding + '\'' +
                ", lifetime=" + lifetime +
                '}';
    }
}
