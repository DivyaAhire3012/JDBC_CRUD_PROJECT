JdbcCrudProject/
├── src/
│   ├── db/
│   ├── dao/
│   ├── model/
│   └── App.java
├── lib/
├── README.md
└── .gitignore

# JDBC CRUD Project

This is a simple Java project that performs **CRUD (Create, Read, Update, Delete)** operations using JDBC with MySQL.  
The project includes three entities:

- 👩‍🎓 **Student** – Uses `Statement`
- 📚 **Library** – Uses `PreparedStatement`
- 👨‍💼 **Employee** – Uses `PreparedStatement`

---

## 💡 Features

- Insert new student, book, and employee records
- View all records
- Update email/salary/book availability
- Delete any record by ID
- Uses `MySQL` database for backend
- Cleanly structured using `Maven-style` folders (manual)

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL (Database)
- Eclipse IDE

---

## 🔧 Database Setup

Create 3 tables in MySQL:

```sql
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    branch VARCHAR(50),
    email VARCHAR(100),
    mobile VARCHAR(15)
);

CREATE TABLE library (
    book_id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(50),
    available BOOLEAN
);

CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    name VARCHAR(50),
    dept VARCHAR(50),
    salary DOUBLE,
    designation VARCHAR(50),
    email VARCHAR(100),
    contact VARCHAR(15),
    location VARCHAR(50)
);

