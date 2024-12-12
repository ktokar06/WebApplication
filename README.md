<h1 align="center">Hi there, I'm<a ></a> Kirill</a> 
<img src="https://github.com/blackcater/blackcater/raw/main/images/Hi.gif" height="32"/></h1>
<h3 align="center"> Student, Java Developer 🇷🇺 </h3>


# 📜 Project: JavaFX Application for Registration and Authentication

This project is a Java application using JavaFX for the graphical user interface and MySQL for storing user data. The application allows users to register and log in using a database. If incorrect login credentials are entered, the input fields shake with an animation. Let's go through the main components and their functionality:

.

## 📦 Installation

1. Clone repositories:
   
 ```bash
 git clone https://github.com/ktokar06/WebApplication.git
 ```

2. Go to the project directory:
   
```bash
cd WebApplication
```

## 📋 Functionality Overview
1. Main Window (Login):

    - The login screen allows the user to enter their username and password for authentication.
    
    - Upon successful login, a new window opens.
    
    - If authentication fails, the login and password fields "shake" with an animation.
    
    - There is a button to navigate to the registration screen (Sign Up).

2. Registration Screen (Sign Up):
  
    - Users can register by filling out a form with fields: first name, last name, username, password, country, and gender.
    
    - Clicking the "Register" button submits the data to the database.

3. Database Interaction:
  
    -MySQL is used to store user information (in the users table), including first name, last name, username, password, country, and gender.
    
    - The application supports two main operations with the database:
    
    - Login: checking for an existing user with the provided username and password.
    
    - Registration: adding a new user to the database.

4. Animations:

    - In case of incorrect login credentials, the input fields for the username and password shake using the Shake animation class, which uses TranslateTransition from JavaFX.

## 🛠️ Main Components of the Project
1. Shake Class (Animation)

    - This class creates a "shake" effect for the specified component (e.g., input fields). The animation lasts 70 milliseconds, runs 3 times, and automatically reverses the component back to its original position.

2. Database Handling Classes:

    - DataBase: This class manages the connection to the MySQL database. It contains methods for connecting, retrieving user data, and adding new users to the database.
    
    - Configs: A class that holds configuration settings for the database connection (e.g., host, port, username, and password).
    
    - Const: A class that defines constants for working with the user table (column names).

3. Controller Classes:

    - Controller: The controller for the main login screen. It contains logic for handling the login process and for navigating to the registration screen.
    
    - SingUpApplication: The controller for the registration screen. It handles the collection of form data and sends it to the database to create a new user.
    
    - HomeController: The controller for the homepage after the user logs in. It manages the image and other elements on the home page.

4. Model Classes:

    - Users: This class represents a user and stores their data (first name, last name, username, password, country, and gender). It also provides getters and setters for these fields.
  
## 💡 How the Application Works
1. Logging In:

    - The user enters their username and password.
    
    - When the login button is clicked, the application checks the database for matching user credentials.
    
    - If the user is found, a new window (e.g., home page) opens.
    
    - If no matching user is found, the fields "shake" to indicate an error.

2. User Registration:

    - The user fills out the registration form with personal information and clicks the "Register" button.
    
    - The data is sent to the database to create a new user.

3. Using Animations:

    - When the user makes a mistake while entering their credentials, the "shake" animation is triggered for the input fields as a visual cue.

## 🔧 Technologies and Tools:

- JavaFX: for creating the graphical user interface (GUI).

- MySQL: for storing and processing user data.

- Java: the main programming platform.

- JDBC: for database interaction.

- FXML: for layout design.

- Maven: for dependency management (if used).

## 🚀 How to Run the Project
1. Set up the Database:

    - Create the itpoger database and the users table.
    
    - Configure the database connection in the Configs.java file (e.g., if your MySQL server is on a different host or port).

2. Run the Application:

    - Run Application.java (the main class with the main method) to start the application.
