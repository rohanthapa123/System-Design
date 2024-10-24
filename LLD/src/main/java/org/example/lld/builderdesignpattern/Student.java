package org.example.lld.builderdesignpattern;

public class Student {
    private String name;
    private String email;
    private int roll_no;
    private String fatherName;
    private String faculty;
    private String practical;

    public Student(StudentBuilder builder){
        this.name = builder.name;
        this.faculty = builder.faculty;
        this.roll_no = builder.roll_no;
        this.fatherName = builder.fatherName;
        this.email = builder.email;
        this.practical = builder.practical;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", roll_no=" + roll_no +
                ", fatherName='" + fatherName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", practical='" + practical + '\'' +
                ']';
    }
}
