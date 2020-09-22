package org.example.javaClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

    protected int id;
    protected String lastName;
    protected String name;
    protected String parentName;
    private LocalDate birthData;
    protected String adress;
    protected String phoneNumber;
    private Faculty faculty;
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
                   String phoneNumber, Faculty faculty,
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

    public Faculty getFaculty() {
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

    public void setFaculty(Faculty faculty) {
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

    /** create list of students
     * @param students
     * @return list of class students
     */
    private static List<Student> createListOfStudents(Student... students) {
        List<Student> list = new ArrayList<Student>();
        list.addAll(Arrays.asList(students));
        return list;
    }

    /**
     * filter student by certain faculty
     */
    public static List<Student> studentByFaculty(Faculty faculty, Student... students) {
        List<Student> list = createListOfStudents( students);
        //TO DO create enum faculty & metog that chek it is valig name of faculty and paste before filtering
        List<Student> studentByFaculty = list.stream()
                .filter(st -> st.getFaculty().equals(faculty))
                .collect(Collectors.toList());

        return  studentByFaculty;
    }

    /*
    * filter student whos birth year is more than given year
     */
    public static List<Student> studentByYear(int year, Student... students) {
        List<Student> list = createListOfStudents( students);

        List<Student> studentByYear = list.stream()
                .filter(st -> st.getBirthData().getYear() > year)
                .collect(Collectors.toList());

        return  studentByYear;
    }

    /**
     * filter student by certain group
     * @param group
     * @param students
     * @return
     */
    public static List<Student> studentByGroupr(String group, Student... students) {
        List<Student> list = createListOfStudents( students);
        //TO DO create enum faculty & metog that chek it is valig name of faculty and paste before filtering
        List<Student> studentByYear = list.stream()
                .filter(st -> st.getGroup().trim().equalsIgnoreCase(group))
                .collect(Collectors.toList());

        return  studentByYear;
    }

    public static void main (String[] args) {

        Student st = new Student(123," lastName",
                 "name",  "parentName",
                LocalDate.of(1988,7,24),  "adress",
                 "phoneNumber",  Faculty.CS,
                 "course",  "group");


        Student st2 = new Student(123," lastName",
                "name",  "parentName",
                LocalDate.of(1998,7,24),  "adress",
                "phoneNumber",  Faculty.Math,
                "course",  "group");


        Student st3 = new Student(123," lastName",
                "name",  "parentName",
                LocalDate.of(1988,7,24),  "adress",
                "phoneNumber",  Faculty.Math,
                "course",  "group");

        System.out.println(Student.studentByYear(1995, st, st2, st3));
      for (Faculty f : Faculty.values()) {

        f.printStudentByFaculty(st, st2, st3);
      }

    }

}

