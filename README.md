# Student Grade Management System

A RESTful API built with Spring Boot that manages students and their grades with automatic GPA calculation.

## Tech Stack
- Java 17
- Spring Boot 4.0
- Spring Data JPA
- H2 In-Memory Database
- Maven

## Features
- Add, view, update, and delete student grades
- Automatic letter grade assignment (A/B/C/D/F)
- GPA calculation per student
- RESTful API design

## API Endpoints

### Students
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /students | Get all students |
| POST | /students | Add a new student |

### Grades
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /grades | Add a grade |
| GET | /grades | Get all grades |
| GET | /grades/student/{id} | Get grades by student |
| GET | /grades/student/{id}/gpa | Get student GPA |
| PUT | /grades/{id} | Update a grade |
| DELETE | /grades/{id} | Delete a grade |

## How to Run
1. Clone the repository
2. Run `mvn spring-boot:run`
3. API runs on `http://localhost:8081`

## Sample Request
```json
POST /grades
{
  "studentId": 1,
  "subject": "Math",
  "marks": 85.0
}
```

## Sample Response
```json
{
  "id": 1,
  "studentId": 1,
  "subject": "Math",
  "marks": 85.0,
  "letterGrade": "B"
}
```