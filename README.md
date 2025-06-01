# ✅ Todo App

A classic Todo App built with Spring Boot, Thymeleaf, and MySQL – because no developer journey is complete without one!  
Whether you're trying to manage your tasks or just checking off “Build a Todo App” from your developer checklist... you're in the right place.

---

## 🛠️ Tech Stack

- **Frontend:** Thymeleaf  
- **Backend:** Spring Boot  
- **Database:** MySQL  
- **Language:** Java 21  

---

## 🚀 Features

- Add a new todo 📝  
- Delete a todo ❌  
- View all todos 📋  
- Feel productive just by looking at them 😌

---

## 💻 Installation Guide

### Prerequisites
Make sure you have the following installed:

- ✅ **Java 21**  
- ✅ **MySQL Server** (running and accessible)  
- ✅ **IntelliJ IDEA / Eclipse / Spring Tool Suite (STS)**

---

### 🧪 Step-by-Step Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/YashwantXDX/Todo_App_Spring_Boot.git
   cd Todo_App_Spring_Boot
   ```

2. **Set up MySQL Database**
   - Create a new database:
     ```sql
     CREATE DATABASE todo_app;
     ```
   - Update your `application.properties` (or `application.yml`) file with your DB credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/todo_app
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

3. **Run the Application**
   - Using **IntelliJ/Eclipse/STS**, open the project and run the `main()` method in the main Spring Boot application class.
   - Or use the terminal:
     ```bash
     ./mvnw spring-boot:run
     ```

4. **Access the App**
   - Open your browser and go to:  
     👉 `http://localhost:8080`

---

## 🤓 Developer Notes

- This project is great for learning:
  - Spring Boot basics
  - MVC architecture
  - CRUD operations with JPA & MySQL
  - Thymeleaf templating engine

---

## 🧾 License

This project is open-source and free to use – no licenses, just vibes.

---

## 🙌 Acknowledgments

Inspired by every dev ever who built a Todo App to learn something new. You're all legends.

---

## 🌟 Show Some Love

If you like the project, don’t forget to ⭐ the repo. It keeps my todos happy!
