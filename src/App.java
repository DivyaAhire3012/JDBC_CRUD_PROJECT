import dao.*;
import model.*;

public class App {
    public static void main(String[] args) {

        StudentDAO sdao = new StudentDAO();
        LibraryDAO ldao = new LibraryDAO();
        EmployeeDAO edao = new EmployeeDAO();

        // ➕ Insert
        sdao.insert(new Student(2, "Tejas", 22, "CSE", "tej@gmail.com", "9999999999"));
        ldao.insert(new Library(102, "C++ Mastery", "John", "OReilly", 2021, "Programming", true));
        edao.insert(new Employee(2, "Kiran", "Dev", "Sr Dev", "kiran@abc.com", "8888888888", "Mumbai", 70000));

        // 📋 Display
        sdao.displayAll();
        ldao.displayAll();
        edao.displayAll();

        // ✏️ Update
        sdao.updateEmail(2, "tej@update.com");
        ldao.updateAvailability(102, false);
        edao.updateSalary(2, 75000);

        // ❌ Delete
        sdao.delete(2);
        ldao.delete(102);
        edao.delete(2);
    }
} 