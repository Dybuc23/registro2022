# Student Registration Service

A RESTful CRUD service for student registration, built with **Java**, **Spring Boot 2.6**, and **MySQL**. Developed as an academic project to practice REST API design and JPA-based persistence.

## Tech Stack

|Layer      |Technology                 |
|-----------|---------------------------|
|Language   |Java                       |
|Framework  |Spring Boot 2.6.3          |
|Persistence|Spring Data JPA / Hibernate|
|Database   |MySQL                      |
|Utilities  |Lombok                     |
|Build Tool |Maven                      |

## Features

- **Full CRUD** — Create, Read, Update, Delete operations for student records
- **MySQL integration** — entity-repository pattern with JPA
- **Clean architecture** — Controller → Service → Repository layering
- **Lombok** — clean entity and DTO definitions

## Project Structure

```
src/
└── main/
    └── java/
        └── pe/com/serviciorest/
            ├── controller/    # REST endpoints
            ├── service/       # Business logic
            ├── repository/    # JPA repositories
            └── model/         # JPA entities (Student, etc.)
```

## Getting Started

### Prerequisites

- Java 8+
- MySQL 8+
- Maven 3.6+

### Setup

1. Clone the repo:

   ```bash
   git clone https://github.com/Dybuc23/registro2022.git
   cd registro2022
   ```
1. Create the database:

   ```sql
   CREATE DATABASE registrodb;
   ```
1. Configure `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/registrodb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
1. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

The API will be available at `http://localhost:8080`.

## API Endpoints

|Method|Endpoint            |Description           |
|------|--------------------|----------------------|
|GET   |`/api/students`     |Get all students      |
|GET   |`/api/students/{id}`|Get student by ID     |
|POST  |`/api/students`     |Register a new student|
|PUT   |`/api/students/{id}`|Update student data   |
|DELETE|`/api/students/{id}`|Remove a student      |


> See controller classes for exact route mapping.

## What I Learned

- Designing and implementing REST APIs from scratch with Spring Boot
- Mapping Java entities to database tables using JPA annotations
- Applying repository pattern with `JpaRepository`
- Structuring a backend project with clear separation of concerns
