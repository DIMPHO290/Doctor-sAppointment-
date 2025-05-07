# Online Book Store (JEE Mini Project)

## Overview

The Online Book Store is a web-based application designed to simplify the process of browsing, searching, and purchasing books online. It provides users with a convenient interface to explore a digital catalog of books, add desired titles to a shopping cart, and place orders from the comfort of their home. For administrators, it allows efficient management of books, categories, and orders.

This mini project is developed using the Java Enterprise Edition (JEE) framework, leveraging its robust features to create a scalable and maintainable multi-tier architecture.

## Features

- User Registration and Login
- Book Browsing and Search Functionality
- Category Filtering
- Shopping Cart Management
- Order Placement and Confirmation
- Admin Panel for Book and Order Management

## 3-Tier Architecture

This application follows the 3-tier architecture model:

### 1. Presentation Tier (Frontend)
- Built using JSP (JavaServer Pages) and HTML/CSS for user interface design.
- Facilitates interaction between users and the system.
- Displays dynamic content using data provided by the business logic.

### 2. Business Logic Tier (Middle Tier)
- Developed with Servlets and JEE technologies.
- Handles all business processes like:
  - User authentication
  - Book filtering
  - Shopping cart operations
  - Order processing
- Ensures communication between the frontend and the backend (database).

### 3. Data Tier (Backend)
- Uses JDBC to interact with a MySQL (or any preferred relational) database.
- Stores:
  - User information
  - Book records
  - Order details
  - Categories and admin data

## Technologies Used

- Java EE (JEE)
  - Servlets
  - JSP
- JDBC (for database connectivity)
- HTML/CSS/JavaScript (frontend enhancements)
- MySQL (database)
- GlassFish Server (JEE-compatible application server)

## Setup Instructions

1. Clone the Repository
2. Import the Project into an IDE
- Use Eclipse or IntelliJ IDEA.
- Import as a Maven project or Dynamic Web Project.

3. Configure Database
- Create a MySQL database (e.g., bookstore_db).
- Import the provided SQL script (if available) to generate tables and seed data.
- Update database connection details in the DBUtil.java or config file.

4. Run the Project
- Deploy to GlassFish Server from your IDE or via command line.
- Access the application at http://localhost:8080/online-book-store/

## Team Members

- Gift
- Dimpho 
- Sharroll

## License

This project is for educational purposes only and is not licensed for commercial use.




