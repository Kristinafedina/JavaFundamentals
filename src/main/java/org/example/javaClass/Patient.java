package org.example.javaClass;

import java.time.LocalDate;
import java.util.List;

public class Patient {

    private int id;
    private String lastName;
    private String name;
    private String parentName;
    private String adress;
    private String phoneNumber;
    private int medicCard;
    private List<String> diagnosis;

    public Patient(int id, String lastName, String name,
                   int medicCard, List<String> diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.medicCard = medicCard;
        this.diagnosis = diagnosis;
    }

    public Patient(int id, String lastName, String name, String parentName,
                   String adress, String phoneNumber, int medicCard, List<String> diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.parentName = parentName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.medicCard = medicCard;
        this.diagnosis = diagnosis;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicCard() {
        return medicCard;
    }

    public void setMedicCard(int medicCard) {
        this.medicCard = medicCard;
    }

    public List<String> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List<String> diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", medicCard=" + medicCard +
                ", diagnosis=" + diagnosis +
                '}';
    }
}
