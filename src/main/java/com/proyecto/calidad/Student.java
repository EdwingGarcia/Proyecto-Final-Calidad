package com.proyecto.calidad;


public class Student {
    private final String name;
    private final double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return name + " : " + grade;
    }
}
