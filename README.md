# Student Registration System

A desktop application for managing student, teacher, and admin records in an educational institution. Built with Java Swing for the GUI and MySQL for the backend database.

---

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Database Setup](#database-setup)
- [Dependencies](#dependencies)
- [Build & Run Instructions](#build--run-instructions)
- [Usage Guide](#usage-guide)
- [Screenshots](#screenshots)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [Author](#author)
- [License](#license)

---

## Features

- **User Authentication:** Secure login for admins.
- **Student Management:** Add, update, search, and delete student records.
- **Admin Management:** Add and view admin users.
- **Teacher Management:** View teacher records.
- **Dashboard:** Centralized home screen for navigation.
- **About/Team:** View information about the development team.
- **Modern UI:** Built with Java Swing, featuring a clean and intuitive interface.

---

## Project Structure

```
Student-Registration/
│
├── student/
│   ├── src/
│   │   ├── Home.java              # Main dashboard after login
│   │   ├── login.java             # Login screen
│   │   ├── student.java           # Student record management (CRUD)
│   │   ├── addStudent.java        # Add new student
│   │   ├── ShowStudent.java       # View all students
│   │   ├── admin.java             # Add new admin
│   │   ├── showAdmin.java         # View all admins
│   │   ├── showTeacher.java       # View all teachers
│   │   ├── about.java             # About dialog
│   │   ├── showAbout.java         # Team/about info from DB
│   │   ├── databaseConnection.java# MySQL connection utility
│   │   └── ... (form files)       # GUI designer files
│   ├── build.xml                  # Ant build script
│   ├── manifest.mf                # JAR manifest
│   └── ... (other build folders)
├── README.md                      # This file
└── ...
```

---

## Database Setup

1. **Install MySQL** and create a database named `student`.
2. **Create the required tables** (example schemas):

```sql
CREATE DATABASE student;
USE student;

CREATE TABLE admin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    mail VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);

CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    fatherName VARCHAR(100),
    city VARCHAR(100),
    blood VARCHAR(5),
    phone VARCHAR(15),
    stdClass VARCHAR(10)
);

CREATE TABLE teachers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    subject VARCHAR(100),
    phone VARCHAR(15)
);

CREATE TABLE team (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    role VARCHAR(100),
    email VARCHAR(100)
);
```

3. **Set MySQL credentials**  
   - Default in code:  
     - User: `root`
     - Password: (empty)
   - To change, edit `student/src/databaseConnection.java`:
     ```java
     final static String USER ="root";
     final static String PASS ="";
     ```

---

## Dependencies

- **Java JDK 8 or higher**
- **MySQL Server**
- **MySQL JDBC Driver** (`mysql-connector-java`)
- **DbUtils Library** (`net.proteanit.sql.DbUtils`)  
  - Download from: [DbUtils GitHub](https://github.com/proteanit/DbUtils)
  - Add the JAR to your project's classpath.

---

## Build & Run Instructions

### Using NetBeans (Recommended)

1. Open the project in NetBeans.
2. Ensure the MySQL JDBC driver and DbUtils JAR are added to the project libraries.
3. Build the project (`Clean and Build`).
4. Run the project (`Run`).

### Using Command Line (Ant)

1. Navigate to the `student` directory.
2. Place the required JARs (`mysql-connector-java`, `DbUtils`) in the `lib/` folder (create if needed).
3. Edit `build.xml` if you need to add classpath entries for the JARs.
4. Run:
   ```sh
   ant clean
   ant build
   ant run
   ```

### JAR Execution

- After building, run the JAR (ensure dependencies are in the classpath):
  ```sh
  java -cp "dist/student.jar;lib/*" MainClass
  ```
  Replace `MainClass` with the actual main class (e.g., `login` or `Home`).

---

## Usage Guide

### 1. Login

- Start the application.
- Enter admin email and password (must exist in the `admin` table).

### 2. Dashboard (Home)

- **Add Student:** Opens form to add a new student.
- **Show Students:** View all student records.
- **Add Admin:** Register a new admin user.
- **Show Admin:** View all admin users.
- **Show Teachers:** View all teacher records.
- **About/Team:** View information about the development team.

### 3. Student Management

- **Add:** Fill in student details and submit.
- **Update/Search/Delete:** Use the student management screen to search by ID and perform actions.

### 4. Admin Management

- **Add Admin:** Enter name, email, and password.
- **Show Admin:** View all registered admins.

### 5. Teacher Management

- **Show Teachers:** View all teacher records.

### 6. About/Team

- **About:** Shows project or author information.
- **Team:** Shows team members from the `team` table.

---

## Screenshots

*(Add screenshots of the login screen, dashboard, student management, etc. here)*

---

## Troubleshooting

- **Database Connection Errors:**  
  - Ensure MySQL is running and credentials in `databaseConnection.java` are correct.
  - Ensure required tables exist.
- **Missing Libraries:**  
  - Add `mysql-connector-java` and `DbUtils` JARs to your classpath.
- **UI Issues:**  
  - Use NetBeans for best compatibility with `.form` files.

---

## Contributing

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Create a new Pull Request.

---

## Author

- **ANKIT RAJ** - Primary developer and maintainer

---

## License

*(Specify your license here, e.g., MIT, GPL, etc.)*

---

**Note:**  
- This project uses Java Swing and is best run on a desktop environment.
- For any issues, please open an issue in the repository or contact the author.