package com.mycompany.softwareprinciple;



/**
 *
 * @author uzair
 */
// Single class handling multiple responsibilities (Low Cohesion)
public class StudentSystem {
    private String name;
    private int age;
    private String course;

    public StudentSystem(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        StudentSystem student1 = new StudentSystem("Ali", 20, "Computer Science");
        StudentSystem student2 = new StudentSystem("Aisha", 22, "Electrical Engineering");

        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
