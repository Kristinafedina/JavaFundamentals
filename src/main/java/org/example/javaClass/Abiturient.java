package org.example.javaClass;

import java.util.List;

public class Abiturient extends  Student {

    private List<Integer> scores;

    public Abiturient(int id, String lastName, String name,
                      String parentName, String adress, String phoneNumber,
                      List<Integer> scores) {
        super(id, lastName, name, parentName, adress, phoneNumber);
        this.scores = scores;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "scores=" + scores +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", parentName='" + parentName + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
