# Create a complete professional README.md file based on the user's project structure

import pypandoc

readme_content = """
# 🎬 Netflix Movies Project

A Spring Boot REST API application for managing Netflix movies data.
This project follows a clean layered architecture using Controller, DTO, Repository, and Exception handling.

---

## 🚀 Features

- Add a new movie
- View all movies
- Get movie by ID
- Update movie details
- Delete movie
- Global exception handling
- Layered architecture (Controller → DTO → Repository)
- Java 17 support

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- REST APIs
- H2 / MySQL (configurable in application.properties)

---

## 📂 Project Structure

netflixmovies  
 ├── src/main/java  
 │    └── com.example.netflixmovies  
 │         ├── controller  
 │         ├── dto  
 │         ├── exception  
 │         ├── repository  
 │         └── NetflixmoviesApplication.java  
 │  
 ├── src/main/resources  
 ├── src/test/java  
 ├── pom.xml  
 ├── mvnw  
 ├── mvnw.cmd  

---

## ⚙️ How to Run the Application

### 1️⃣ Clone the Repository

git clone https://github.com/soundarya509/netflixmoviesproject.git

### 2️⃣ Navigate to Project Folder

cd netflixmoviesproject

### 3️⃣ Run Using Maven

mvn spring-boot:run

OR

./mvnw spring-boot:run

---

## 🌐 Sample API Endpoints

GET     /movies          → Get all movies  
GET     /movies/{id}     → Get movie by ID  
POST    /movies          → Add new movie  
PUT     /movies/{id}     → Update movie  
DELETE  /movies/{id}     → Delete movie  

---

## 🧪 Testing

You can test APIs using:
- Postman
- Thunder Client (VS Code)
- cURL

---

## 👩‍💻 Author

Soundarya  
GitHub: https://github.com/soundarya509  

---

## 📄 License

This project is created for learning and demonstration purposes.
"""

output_path = "/mnt/data/README.md"

pypandoc.convert_text(readme_content, 'md', format='md', outputfile=output_path, extra_args=['--standalone'])

output_path
