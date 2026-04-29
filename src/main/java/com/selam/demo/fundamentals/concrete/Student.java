package com.selam.demo.fundamentals.concrete;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private String major;
    private double gpa;

    public Student(String studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = 0.0;
    }

    // All methods are fully implemented
    public void study() {
        System.out.println("📚 " + name + " is studying " + major);
    }

    public void takeExam(String subject, double score) {
        System.out.println("📝 " + name + " scored " + score + "% in " + subject);
        updateGPA(score);
    }

    public void attendClass() {
        System.out.println("🏫 " + name + " is attending class");
    }

    public void submitAssignment(String assignment) {
        System.out.println("📄 " + name + " submitted: " + assignment);
    }

    private void updateGPA(double score) {
        this.gpa = (this.gpa + (score / 25)) / 2;
    }

    // Getters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return String.format("Student[ID=%s, Name=%s, Major=%s, GPA=%.2f]",
                studentId, name, major, gpa);
    }
}