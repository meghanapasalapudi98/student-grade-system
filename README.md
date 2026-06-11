# student-grade-system

Spring Boot REST API to manage students and calculate grades automatically.

Built with Java 17, Spring Boot, Spring Data JPA, H2, Maven.

## Run locally

git clone https://github.com/meghanapasalapudi98/student-grade-system.git
cd student-grade-system
.\mvnw spring-boot:run

Runs on http://localhost:8081/students

## Endpoints

GET    /students        - list all students
POST   /students        - add student
PUT    /students/{id}   - update student
DELETE /students/{id}   - delete student

## Example

POST /students
{ "name": "John", "marks": 88 }

Returns: { "id": 1, "name": "John", "marks": 88, "grade": "B" }

Grades: 90+=A, 80+=B, 70+=C, 60+=D, below 60=F

## H2 Console

http://localhost:8081/h2-console
JDBC URL: jdbc:h2:mem:testdb / user: sa / password: (blank)
