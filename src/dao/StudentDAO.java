package dao;

import database.DBConnection;
import model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {
    public void insert(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String q = "INSERT INTO student VALUES (" + s.id + ", '" + s.name + "', " + s.age + ", '" +
                    s.course + "', '" + s.email + "', '" + s.contact + "')";
            st.executeUpdate(q);
            System.out.println("Student inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayAll() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | " +
                                   rs.getString(4) + " | " + rs.getString(5) + " | " + rs.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateEmail(int id, String newEmail) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String q = "UPDATE student SET email='" + newEmail + "' WHERE id=" + id;
            st.executeUpdate(q);
            System.out.println("Student email updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            st.executeUpdate("DELETE FROM student WHERE id=" + id);
            System.out.println("Student deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}