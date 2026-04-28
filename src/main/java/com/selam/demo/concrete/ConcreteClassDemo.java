package com.selam.demo.concrete;

public class ConcreteClassDemo {
    public static void main(String[] args) {

        // Direct instantiation - concrete class!
        Student student1 = new Student("ST001", "Selam", 21, "Computer Science");
        Student student2 = new Student("ST002", "John", 22, "Mathematics");

        System.out.println("✅ Created students via concrete class:");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("\n--- Student Activities ---");
        student1.attendClass();
        student1.study();
        student1.submitAssignment("OOP Homework");
        student1.takeExam("Java Programming", 92);

        System.out.println("\n" + student1);
        System.out.println("\n Concrete classes: ready to use, fully implemented!");
    }
}