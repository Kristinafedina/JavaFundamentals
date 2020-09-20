package org.example.javaClass;

import java.time.LocalDate;

public class Student {

    protected int id;
    protected String lastName;
    protected String name;
    protected String parentName;
    private LocalDate birthData;
    protected String adress;
    protected String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student(int id, String lastName, String name,
                   String parentName, String adress, String phoneNumber) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.parentName = parentName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Student(int id, String lastName,
                   String name, LocalDate birthData,
                   String adress, String phoneNumber) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.birthData = birthData;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Student(int id, String lastName,
                   String name, String parentName,
                   LocalDate birthData, String adress,
                   String phoneNumber, String faculty,
                   String course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.parentName = parentName;
        this.birthData = birthData;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    //getters
    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    public LocalDate getBirthData() {
        return birthData;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setBirthData(LocalDate birthData) {
        this.birthData = birthData;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    //
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", birthData='" + birthData + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

