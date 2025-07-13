package model;

public class Employee {
    public int emp_id;
    public String name, department, designation, email, contact, address;
    public double salary;

    public Employee(int emp_id, String name, String department, String designation, String email, String contact, String address, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.salary = salary;
    }
}
