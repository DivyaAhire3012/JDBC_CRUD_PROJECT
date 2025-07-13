package dao;

import database.DBConnection;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.*;

public class EmployeeDAO {
    public void insert(Employee e) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, e.emp_id);
            ps.setString(2, e.name);
            ps.setString(3, e.department);
            ps.setString(4, e.designation);
            ps.setString(5, e.email);
            ps.setString(6, e.contact);
            ps.setString(7, e.address);
            ps.setDouble(8, e.salary);
            ps.executeUpdate();
            System.out.println("Employee inserted.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void displayAll() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSalary(int emp_id, double salary) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "UPDATE employee SET salary=? WHERE emp_id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setDouble(1, salary);
            ps.setInt(2, emp_id);
            ps.executeUpdate();
            System.out.println("Employee salary updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int emp_id) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "DELETE FROM employee WHERE emp_id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, emp_id);
            ps.executeUpdate();
            System.out.println("Employee deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
