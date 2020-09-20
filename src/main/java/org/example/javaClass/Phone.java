package org.example.javaClass;

import java.time.LocalDate;

public class Phone {

    private int id;
    private String lastName;
    private String name;
    private String parentName;
    private String adress;
    private long cardNumber;
    private float debetr;
    private float credit;
    private LocalDate timeIntercityCalls;
    private LocalDate timeCityCalls;

    public Phone(int id, String lastName, String name, String parentName, String adress,
                 long cardNumber, float debetr, float credit, LocalDate timeIntercityCalls,
                 LocalDate timeCityCalls) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.parentName = parentName;
        this.adress = adress;
        this.cardNumber = cardNumber;
        this.debetr = debetr;
        this.credit = credit;
        this.timeIntercityCalls = timeIntercityCalls;
        this.timeCityCalls = timeCityCalls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getDebetr() {
        return debetr;
    }

    public void setDebetr(float debetr) {
        this.debetr = debetr;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public LocalDate getTimeIntercityCalls() {
        return timeIntercityCalls;
    }

    public void setTimeIntercityCalls(LocalDate timeIntercityCalls) {
        this.timeIntercityCalls = timeIntercityCalls;
    }

    public LocalDate getTimeCityCalls() {
        return timeCityCalls;
    }

    public void setTimeCityCalls(LocalDate timeCityCalls) {
        this.timeCityCalls = timeCityCalls;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", parentName='" + parentName + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNumber=" + cardNumber +
                ", debetr=" + debetr +
                ", credit=" + credit +
                ", timeIntercityCalls=" + timeIntercityCalls +
                ", timeCityCalls=" + timeCityCalls +
                '}';
    }
}
