# Fitness App - README

## Overview
This Fitness App is built using Java and follows the Model-View-Controller (MVC) architecture. It is designed to help users manage their workout plans, track progress, and maintain fitness routines. The application uses an SQLite database for data persistence and Java Swing for the user interface.

## Features
- **User Login & Registration:** Basic login functionality with a placeholder for future registration implementation.
- **Workout Management:** Add, view, and manage workout plans.
- **Database Integration:** SQLite database (`fitness_app.db`) for storing user data and workout plans.
- **MVC Architecture:** Clear separation of concerns between models, views, and controllers.

## Project Structure
The project follows a modular structure:

- `src/controller/`: Contains the logic for managing data and communication between the view and the model.
  - `WorkoutManager.java`: Handles operations related to workout plans.
  - `UserManager.java`: Manages user authentication and data.

- `src/model/`: Defines the data models used in the app.
  - `WorkoutPlan.java`: Represents a workout plan with attributes like name, duration, and intensity.
  - `User.java`: Represents a user with attributes like username and password.

- `src/view/`: Implements the graphical user interface (GUI) using Java Swing.
  - `LoginScreen.java`: Provides a login interface for users.
  - `MainScreen.java`: Main dashboard for navigating the app.
  - `WorkoutSelectionScreen.java`: Allows users to view and select workout plans.

- `src/database/`: Contains database-related utilities.
  - `DatabaseConnection.java`: Establishes a connection to the SQLite database.

## Prerequisites
- Java Development Kit (JDK) 8 or later
- SQLite JDBC Driver (`sqlite-jdbc.jar`) added to the classpath

## Setup Instructions
1. Clone the repository or extract the project ZIP file.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Ensure the SQLite JDBC driver is added to your project's classpath.
4. Place the `fitness_app.db` file in the root directory of the project.
5. Run the `view.LoginScreen` class to start the application.

## Database Schema
The `fitness_app.db` file should contain the following schema:
```sql
CREATE TABLE IF NOT EXISTS Users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    username TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS WorkoutPlans (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    workoutName TEXT NOT NULL,
    duration TEXT NOT NULL,
    intensity TEXT NOT NULL
);
```

## Future Improvements
- Add user registration functionality.
- Enhance the UI for a more modern look.
- Implement progress tracking and analytics.
- Add password hashing for better security.

## Contribution
Feel free to fork the repository and submit pull requests for any improvements or bug fixes.

## License
This project is open-source and available under the MIT License.

