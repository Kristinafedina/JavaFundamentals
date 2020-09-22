package org.example.javaClass;

import java.util.List;

public enum Faculty {

    Math {
        @Override
        public void printStudentByFaculty(Student...students) {
            System.out.println("List of students from " + Math.name()+ " : ");
            List<Student> student = Student.studentByFaculty(Math, students);
            for(int i = 1; i < student.size(); i++) {
                 System.out.println(i  + ". " + student.get(i-1));

             }
        }
    },
    CS {
        @Override
        public void printStudentByFaculty(Student... students) {
            System.out.println("List of students from " + CS.name()+ " : ");
            List<Student> student = Student.studentByFaculty(CS, students);
            for(int i = 1; i < student.size(); i++) {
                System.out.println(i  + ". " + student.get(i-1));

            }}

    };

    public abstract void printStudentByFaculty (Student...students) ;
}
