package org.example.lld.builderdesignpattern;

public class StudentBuilder {

    public String name;
    public String email;
    public int roll_no;
    public String fatherName;
    public String faculty;
    public String practical;

    public StudentBuilder(String name, String  email){
        this.name = name;
        this.email = email;
    }

    public StudentBuilder setRoll_no(int roll_no) {
        this.roll_no = roll_no;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setFaculty(String faculty) {
        this.faculty = faculty;
        return this;
    }

    public StudentBuilder setPractical(String practical) {
        this.practical = practical;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
