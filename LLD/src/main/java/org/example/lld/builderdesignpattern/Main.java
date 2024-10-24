package org.example.lld.builderdesignpattern;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentBuilder("Rohan Thapa","thaparohan2019@gmail.com")
                .setRoll_no(18)
                .setFaculty("BCA")
                .setPractical("A+")
                .build();

        System.out.println(student.toString());


    }
}
