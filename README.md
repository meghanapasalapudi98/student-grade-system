# 🎓 Student Grade Management System

A RESTful API built with **Java Spring Boot** that manages student records and calculates letter grades. Designed to demonstrate backend development skills using industry-standard tools.

---

## 📌 Features

- Add new student records with name and score
- Retrieve all students
- Automatic letter grade calculation based on score (A, B, C, D, F)
- In-memory H2 database (no setup required)
- Clean REST API design following industry conventions

---

## 🛠️ Tech Stack

| Technology       | Purpose                        |
|------------------|--------------------------------|
| Java 17          | Core programming language      |
| Spring Boot 3.x  | Backend framework              |
| Spring Data JPA  | Database interaction (ORM)     |
| H2 Database      | In-memory database for testing |
| Maven            | Build and dependency management|

---

## 📂 Project Structure

```
student-grade-system/
├── src/
│   └── main/
│       └── java/
│           └── com/example/studentgradesystem/
│               ├── StudentGradeSystemApplication.java  (Main entry point)
│               ├── controller/
│               │   └── StudentController.java          (REST endpoints)
│               ├── model/
│               │   └── Student.java                    (Data model)
│               └── repository/
│                   └── StudentRepository.java          (Database layer)
├── pom.xml
└── README.md
```

---

## 🔌 API Endpoints

| Method | Endpoint          | Description              |
|--------|-------------------|--------------------------|
| GET    | `/students`       | Get all students         |
| POST   | `/students`       | Add a new student        |

### Sample Request — Add a Student

**POST** `http://localhost:8081/students`

```json
{
  "name": "John Smith",
  "score": 88
}
```

### Sample Response

```json
{
  "id": 1,
  "name": "John Smith",
  "score": 88,
  "grade": "B"
}
```

---

## 📊 Grade Calculation Logic

| Score Range | Letter Grade |
|-------------|--------------|
| 90 – 100    | A            |
| 80 – 89     | B            |
| 70 – 79     | C            |
| 60 – 69     | D            |
| Below 60    | F            |

---

## ▶️ How to Run

### Prerequisites
- Java 17 or higher installed
- No database setup needed (H2 runs in memory)

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/meghanapasalapudi98/student-grade-system.git
   cd student-grade-system
   ```

2. **Run the application**
   ```bash
   .\mvnw spring-boot:run
   ```

3. **Test the API**
   Open your browser or use Postman:
   ```
   http://localhost:8081/students
   ```

4. **View the H2 Database Console** *(optional)*
   ```
   http://localhost:8081/h2-console
   ```
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: *(leave blank)*

---

## 💡 What I Learned

- Building REST APIs with Spring Boot
- Using Spring Data JPA to interact with a database
- Structuring a Java backend project with MVC pattern (Model, Controller, Repository)
- Version control with Git and GitHub

---

## 👩‍💻 Author

**Meghana Pasalapudi**  
Full Stack Java Developer  
[GitHub Profile](https://github.com/meghanapasalapudi98)
