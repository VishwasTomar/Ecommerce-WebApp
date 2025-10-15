# 🛒 E-commerce Web App

A full-stack e-commerce platform built with Java, Spring Boot, and Thymeleaf, featuring a clean admin panel and a seamless user shopping experience.

## ✨ Features

### 👥 User Features
- **User Authentication & Authorization**: Secure sign-up, login, and role-based access control.
- **Product Browsing**: View products with images, descriptions, and categories.
- **Shopping Cart**: Add, remove, and manage items before checkout.
- **Order Management**: Complete purchase flow with order history.

### ⚙️ Admin Features
- **Admin Panel**: Centralized dashboard for site management.
- **Product Management (CRUD)**: Full control to create, read, update, and delete products.
- **User Management**: Oversee user accounts and roles.
- **Order Fulfillment**: Review and manage customer orders.

## 🛠️ Built With

* [![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
* [![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
* [![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)](https://hibernate.org)
* [![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)](https://www.thymeleaf.org/)
* [![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
* [![Bootstrap](https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)](https://getbootstrap.com/)
* [![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/HTML)
* [![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)

## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

- **Java JDK 8 or above**
- **Maven**
- **MySQL Server**
- **Git**

### Installation & Setup

1.  **Clone the repository**
    ```bash
    git clone https://github.com/your-username/your-ecommerce-repo.git
    cd your-ecommerce-repo
    ```

2.  **Set up the MySQL database**
    ```sql
    CREATE DATABASE electricks;
    ```

3.  **Import the database schema** (if you have an SQL file)
    ```bash
    mysql -u your_username -p electricks < path/to/your/database.sql
    ```

4.  **Configure application properties**
    Update `src/main/resources/application.properties` with your database credentials:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/electricks
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

5.  **Run the application**
    ```bash
    mvn spring-boot:run
    ```

6.  **Access the application**
    - **Main Site**: Open your browser and go to `http://localhost:8080`
    - **Admin Panel**: Navigate to `http://localhost:8080/admin` (Check your project for the exact URL)



## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📜 License

Distributed under the MIT License. See `LICENSE` file for more information.
