# Scalable URL Shortener

This is a highly scalable and robust URL 
shortener service built with a microservices
architecture. The goal is to provide a reliable platform for creating, managing, and tracking short URLs. The application is designed to handle high traffic, offering real-time click analytics and a seamless user experience.

---

## Features

- **Core Functionality**: Create short, random URLs from any long URL.
- **User Management**: Secure user authentication with password-based and Google OAuth login, including account registration and password resets.
- **Real-time Analytics**: View real-time click counts and analytics for your short URLs.
- **QR Code Generation**: Instantly generate QR codes for any shortened link.
- **Link Control**: Easily edit the short URL path, and activate or deactivate links at any time.
- **High Performance**: Built to handle millions of requests with low latency.
- **Scalable Architecture**: The microservices design ensures the system can grow to meet increasing demand.

---

## Technology Stack

Our decoupled architecture uses a modern tech stack to ensure performance and scalability.

**Frontend:**
- **Thymeleaf**

**Backend:**
- **Spring Modulith**: A Java framework for building modular, maintainable, and scalable backend services.
- **Kafka**: An event streaming platform that handles real-time click events, decoupling the click logging from analytics processing.
- **Redis**: An in-memory data store used for caching URL lookups, significantly reducing database load and improving redirection speed.
- **PostgreSQL**: A powerful and reliable relational database for persistent storage of user and URL data.

---

## System Architecture

The project is structured around several independent microservices (Currently deployed together as part of a modular monolith) that communicate with each other. This design allows for independent scaling, development, and deployment of each component.

- **AuthService**: Manages all user authentication flows (login, registration, password resets).
- **ShortenerService**: The core service for creating, updating, and managing short URLs.
- **AnalyticsService**: Consumes click events from Kafka to process and store aggregated analytics data.
- **ClickService**: A lightweight, high-performance service responsible for redirecting users and logging click events to Kafka.
- **NotificationService**: A service that subscribes to click events to send notifications.

---

## Getting Started

To get the project up and running, follow these steps:

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/fred-maina/url-shortener
    cd url-shortener
    ```

2.  **Set up the environment:**
    - Make sure you have Docker and Docker Compose installed.
    - Set up your environment variables for database credentials and API keys (e.g., for Google OAuth).

3.  **Run the application:**
    Use Docker Compose to start all services and dependencies (PostgreSQL, Kafka, Redis).
    ```bash
    docker compose up -d
    ```

4.  **Access the application:**
    - The  services will be running on their respective ports.



## License

This project is licensed under the MIT License - see the `LICENSE` file for details.