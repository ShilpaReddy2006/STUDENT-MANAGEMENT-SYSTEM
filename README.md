# Student Management System

A **Spring Boot REST API project** for managing student records using **Spring Boot, Spring Data JPA, Hibernate, and MySQL**.  
This project implements a **layered architecture (Controller, Service, Repository, Entity)** and supports full CRUD operations.

---

## 🚀 Features

- Create new student
- Retrieve all students
- Get student by ID
- Update student details
- Delete student record
- RESTful API design
- MySQL database integration
- Clean layered architecture

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## 📁 Project Structure

```
STUDENT-MANAGEMENT-SYSTEM
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/sms/student_management_system
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── StudentManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│
└── pom.xml
```

---

## ⚙️ Database Configuration

Update `application.properties`:

```properties
spring.application.name=student-management-system

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=root123

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8082
```

---

## 📌 API Endpoints

### ➕ Create Student
**POST** `/students`

```json
{
  "name": "John",
  "course": "CSE",
  "fee": 50000
}
```

---

### 📄 Get All Students
**GET** `/students`

---

### 🔍 Get Student by ID
**GET** `/students/{id}`

Example:
```
/students/1
```

---

### ✏️ Update Student
**PUT** `/students/{id}`

```json
{
  "name": "John Updated",
  "course": "ECE",
  "fee": 60000
}
```

---

### ❌ Delete Student
**DELETE** `/students/{id}`

Example:
```
/students/1
```

---

## ▶️ How to Run the Project

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/student-management-system.git
```

### 2. Navigate to Project Folder
```bash
cd student-management-system
```

### 3. Create Database
```sql
CREATE DATABASE student_db;
```

### 4. Run the Application
```bash
mvn spring-boot:run
```

OR run:
```
StudentManagementSystemApplication.java
```

---

## 🌱 Future Improvements

- Global exception handling using `@ControllerAdvice`
- Input validation using Hibernate Validator
- Swagger API documentation
- Spring Security (JWT Authentication)
- Pagination and sorting
- Unit testing with JUnit & Mockito

---

## 👩‍💻 Author

**Yerravalla Shilpa Reddy**
