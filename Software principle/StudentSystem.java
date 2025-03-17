/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.softwithoutprinciple;

/**
 *
 * @author uzair
 */

// Class representing a Student (Only handles student-related data)
class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

// Class responsible for managing student operations (High Cohesion)
class StudentManager {
    public void printStudentDetails(Student student) {
        student.displayInfo();
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", 20, "Computer Science");
        Student student2 = new Student("Aisha", 22, "Electrical Engineering");

        StudentManager studentManager = new StudentManager();
        studentManager.printStudentDetails(student1);
        studentManager.printStudentDetails(student2);
    }
}

