# 📚 Spring Library Management REST API 🚀

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.2-brightgreen?logo=spring)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?logo=postgresql)

A modern library management REST API built with Spring Data REST and Spring MVC. This platform enables users to perform CRUD operations on books with security features. 📖✨

## 🌟 Features

- **RESTful API endpoints** for book management
- **Spring Data JPA** for database operations
- **PostgreSQL** database integration
- **Spring Security** for authentication
- **Lombok** for cleaner code
- **DevTools** for development convenience
- **Hibernate** for ORM

## 🛠️ Technologies Used

- **Backend**: 
  - Java 17 ☕
  - Spring Boot 3.4.2 🍃
  - Spring Data REST
  - Spring MVC
  - Spring Security 🔒
  
- **Database**: 
  - PostgreSQL 🐘
  - Hibernate
  
- **Tools**: 
  - Lombok
  - Maven
  - Spring Boot DevTools

## 🚀 Getting Started

### Prerequisites
- Java 17 JDK
- Maven 3.6+
- PostgreSQL 15+

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/ahmetyagiz/spring-library-management.git
   ```
2. Configure your PostgreSQL database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
   spring.datasource.username=postgres
   spring.datasource.password=your_password
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## 📚 API Endpoints

All endpoints are prefixed with `/api`

| Method | Endpoint       | Description                |
|--------|----------------|----------------------------|
| GET    | `/books`       | Get all books 📚          |
| GET    | `/books/{id}`  | Get a specific book 🔍    |
| POST   | `/books`       | Add a new book ➕         |
| PUT    | `/books/{id}`  | Update a book ✏️         |
| DELETE | `/books/{id}`  | Delete a book ❌         |

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📄 License

This project is open-source. Feel free to use it as you like!

---

Made with ❤️ by [Ahmet Yağız](https://github.com/ahmetyagiz)
