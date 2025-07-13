package dao;

import database.DBConnection;
import model.Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LibraryDAO {
    public void insert(Library l) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "INSERT INTO library VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, l.book_id);
            ps.setString(2, l.title);
            ps.setString(3, l.author);
            ps.setString(4, l.publisher);
            ps.setInt(5, l.year);
            ps.setString(6, l.genre);
            ps.setBoolean(7, l.available);
            ps.executeUpdate();
            System.out.println("Library book inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayAll() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM library");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateAvailability(int book_id, boolean available) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "UPDATE library SET available=? WHERE book_id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setBoolean(1, available);
            ps.setInt(2, book_id);
            ps.executeUpdate();
            System.out.println("Library availability updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int book_id) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "DELETE FROM library WHERE book_id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, book_id);
            ps.executeUpdate();
            System.out.println("Library record deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

