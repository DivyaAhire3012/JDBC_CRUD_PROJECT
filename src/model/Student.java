package model;

public class Student {
    public int id;
    public String name, course, email, contact;
    public int age;

    public Student(int id, String name, int age, String course, String email, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
        this.contact = contact;
    }
}
