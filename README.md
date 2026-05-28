HMS Microservices - Hospital Management System

Backend-based Hospital Management System developed using Spring Boot Microservices architecture.

Features
Patient Management
Appointment Booking
Billing Service
JWT Authentication
Role-Based Authorization
API Gateway Routing
Eureka Service Discovery
Inter-service Communication

Tech Stack:
Java 17
Spring Boot
Spring Security
Spring Cloud Gateway
Eureka Server
JWT
REST APIs
MySQL
JPA / Hibernate
Maven
Microservices
Service	Port
Eureka Server	8761
API Gateway	9090
Patient Service	8080
Appointment Service	8082
Billing Service	8083
Auth Service	8084

Architecture
CClient / Postman
        ↓
API Gateway (9090)
        ↓
 ┌─────────────────────────────┐
 │         Eureka Server       │
 │            (8761)           │
 └─────────────────────────────┘
        ↓
------------------------------------------------
|               Microservices                  |
------------------------------------------------
| Patient Service       → Port 8080           |
| Appointment Service   → Port 8082           |
| Billing Service       → Port 8083           |
| Auth Service          → Port 8084           |
------------------------------------------------

Security
JWT-based Authentication
PATIENT role can book appointments
ADMIN role can access billing APIs

Run Project

Start services in order:

1. Eureka Server
2. Patient Service
3. Billing Service
4. Auth Service
5. Appointment Service
6. API Gateway

Run each service:
.\mvnw.cmd spring-boot:run

Future Enhancements
React Frontend
Docker Deployment
PostgreSQL Migration
Cloud Deployment
Swagger Documentation

Author
Shravani Kulte