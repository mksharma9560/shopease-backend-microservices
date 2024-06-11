## ShopEase Microservices Project
*Welcome to the ShopEase microservices project! This repository contains the code for the ShopEase application, which is a comprehensive e-commerce platform enabling customers to browse products, place orders, and make payments, with robust features for notifications and service discovery. The project is built using a microservices architecture to ensure scalability, maintainability, and flexibility.*

## Table of Contents
Overview
Architecture
Services
Technologies
Setup
Usage
Contributing
License

## Overview
ShopEase is an e-commerce platform where customers can interact with various services to manage their shopping experience. The platform supports the following key features:

* Customer registration and management
* Product catalog browsing
* Order placement and tracking
* Payment processing
* Notifications for order and payment status
* Configuration management
* Service discovery and routing
* Security and distributed tracing

## Architecture
ShopEase follows a microservices architecture where each service is responsible for a specific domain area. The services communicate asynchronously using Apache Kafka and synchronously using OpenFeign and RestTemplate. Distributed tracing is implemented with Zipkin and Spring Actuator, and security is enforced using Keycloak.

## Architecture
![Project Architecture](https://github.com/mksharma9560/shopease-backend-microservices/blob/master/diagrams/ShopEase_Architecture.JPG)


## Services
The project consists of the following services:

**1. Customer Service**
**Responsibilities:**

* Manages customer information including first name, last name, email, and address.
* Handles customer registration and updates.
* Provides endpoints for customer details retrieval and modification.

**Key Components:**

* Customer Repository: Handles CRUD operations for customer data.
* Customer Controller: Manages API requests for customer data.
* Customer Service: Implements business logic for customer management.

**2. Product Service**
**Responsibilities:**

* Manages the product catalog, including product details, availability, and inventory.
* Handles CRUD operations for product data.
* Provides endpoints for product listing and searching.

**Key Components:**

* Product Repository: Handles CRUD operations for product data.
* Product Controller: Manages API requests for product data.
* Product Service: Implements business logic for product management.

**3. Order Service**
**Responsibilities:**

* Handles order placement, tracking, and management.
* Manages order lifecycle from creation to completion.
* Communicates with Customer Service and Product Service for order validation.

**Key Components:**

* Order Repository: Handles CRUD operations for order data.
* Order Controller: Manages API requests for order data.
* Order Service: Implements business logic for order management.

**4. Payment Service**
**Responsibilities:**

* Processes customer payments and handles payment status.
* Integrates with payment gateways for transaction processing.
* Updates order status based on payment results.

**Key Components:**

* Payment Repository: Handles CRUD operations for payment data.
* Payment Controller: Manages API requests for payment processing.
* Payment Service: Implements business logic for payment processing.

**5. Notification Service**
**Responsibilities:**

* Sends notifications to customers regarding order and payment status via email.
* Listens to order and payment events from Kafka and triggers email notifications.
* Manages email templates and notification delivery.

**Key Components:**

* Notification Controller: Manages API requests for notifications.
* Notification Service: Implements business logic for sending notifications.
* Kafka Listener: Listens to Kafka topics for order and payment events.

**6. Config Server**
**Responsibilities:**

* Manages external configurations for all services.
* Provides centralized configuration management.
* Uses Spring Cloud Config for configuration storage and retrieval.

**Key Components:**
* Config Server: Manages and serves configurations.

**7. Discovery Service**
**Responsibilities:**

* Provides service discovery and registration using Eureka.
* Enables services to find and communicate with each other dynamically.

**Key Components:**
* Eureka Server: Manages service registry and discovery.

**8. Gateway Service**
**Responsibilities:**

* Acts as a gateway for routing requests to the appropriate services.
* Provides a single entry point for client requests.
* Implements API gateway pattern using Spring Cloud Gateway.

**Key Components:**

* Gateway Controller: Manages API routing.
* Gateway Service: Implements routing and filtering logic.

## Technologies
The following technologies and frameworks are used in this project:

* **Spring Boot:** Framework for building microservices
* **Spring Cloud:** Suite of tools for building distributed systems
* **Kafka:** Asynchronous messaging platform
* **OpenFeign:** Declarative REST client
* **RestTemplate:** Synchronous HTTP client
* **Zipkin:** Distributed tracing system
* **Spring Actuator:** Monitoring and management
* **Keycloak:** Identity and access management
* **Eureka:** Service discovery
* **Docker:** Containerization
