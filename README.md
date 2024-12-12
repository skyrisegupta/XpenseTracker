# Xpense Tracker

Xpense Tracker is a web application for tracking expenses and splitting costs with friends, roommates, or co-payers. Built with Spring Boot, it ensures efficient and reliable performance.

## Features

- **Expense Tracking**: Record, categorize, and analyze spending.
- **Split Expenses**: Create groups, add shared expenses, and calculate splits automatically.
- **Customizable Settings**: Add categories, set currency preferences, and manage privacy.

## Installation

### Prerequisites

- Java 17 or higher
- Maven
- PostgreSQL or MySQL database

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/skyrisegupta/Xpensetracker.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Xpensetracker
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   java -jar target/xpense-tracker-0.0.1-SNAPSHOT.jar
   ```
5. Access the app at `http://localhost:8080`.

### Configuration

- Update database settings in `application.properties`:
  ```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/xpense_tracker
  spring.datasource.username=yourusername
  spring.datasource.password=yourpassword
  ```

## Technologies Used

- **Backend**: Spring Boot
- **Frontend**: React (optional for web interface)
- **Database**: PostgreSQL/MySQL

## Contributing

1. Fork the repository.
2. Create a new branch.
3. Make changes and commit.
4. Push changes and open a pull request.


## Contact

- Email: [skyrisegupta@gmail.com ](mailto\:skyrisegupta@gmail.com)


Simplify expense tracking with **Xpense Tracker**!

