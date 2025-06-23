# 🛒 SpringStore

A full-featured RESTful backend for an e-commerce platform built with **Spring Boot**. Supports secure user registration, product and category management, shopping cart operations, and checkout via **Stripe**. The application follows clean architecture principles using controller-service-repository layering and integrates modern dev tools like **JWT**, **MapStruct**, and **Flyway**.
## 🚀 Features

- ✅ User registration & login with **JWT authentication**
- 📦 Product & category CRUD (Create, Read, Update, Delete)
- 🛍️ Shopping cart management
- 💳 Checkout flow with **Stripe API**
- 🧭 API documentation via **Swagger UI**
- 🔄 Automated DB migrations using **Flyway**
- 🧱 Clean controller-service-repository architecture

## 🧰 Tech Stack

**Backend:**  
Spring Boot, Spring Security, JPA (Hibernate), MapStruct, JWT, Stripe API, Flyway

**Tools & Services:**  
MySQL, Swagger, Maven, IntelliJ IDEA

## 🧪 API Endpoints

Example API Flow:

1. `GET /products` - List all products  
2. `POST /users` - Register a new user  
3. `POST /auth/login` - Login and receive JWT  
4. `POST /carts` - Create a new cart  
5. `POST /carts/{id}/items` - Add item to cart  
6. `POST /checkout` - Start Stripe checkout session  

> Swagger documentation available at:  
> `http://localhost:8080/swagger-ui.html`

## 🛠️ Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/terryChou28/spring-store.git
   cd spring-store
   ```

2. **Configure your database**  
   Update your `application.yaml` file with the correct MySQL credentials.

3. **Run the project**
   ```bash
   ./mvnw spring-boot:run
   ```
   or on Windows:
   ```bash
   mvnw.cmd spring-boot:run
   ```

## 📸 Screenshot

![Dashboard Screenshot](src/assets/dashboard.png)
