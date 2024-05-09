# Team Directory Application

## Overview
This application provides a web interface for managing a team directory. Users can add, update, and delete player entries, viewing a list of all team members with detailed statistics.

## Features

### 1. **Home Page Redirection**
   - Automatically redirects to the team list page.

### 2. **Team List**
   - View a comprehensive list of all team members.
   - Each team member entry includes details such as:
     - Player Number
     - First Name
     - Last Name
     - Position
     - Yellow Cards
     - Red Cards
     - Goals
     - Assists
   - Functionalities to update or delete player entries are available for each player listed.

### 3. **Add Player**
   - A form to input a new player's details 
   - Validation for each input field to ensure data integrity:
        - Player Number is in range 1-99
        - First and Last Name is trimmed from whitespaces (I didnt use regex to avoid numbers and etc. because someday maybe Elon Musk will use this web app and he wont be able to insert his son's name :) 
        - Position to chose from 4 options (Goalkeeper, Defender, Midfielder, Forward)
        - Red/Yellow Cards, Goals, Assists minimum value 0
  

### 4. **Update Player**
   - Users can update existing player information through a similar form used for adding new players.

### 5. **Delete Confirmation**
   - A confirmation prompt to prevent accidental deletions of player data.

### 6. **Responsive Design**
   - The application is responsive, ensuring it is usable on desktops, tablets, and mobile devices.

### 7. **Styling**
   - The application uses Bootstrap for styling to provide a clean and modern user interface.

## Technology Stack

- **Frontend:** HTML, CSS (Bootstrap), small amount of JS
- **Backend:**
  - Java
  - Spring Boot
  - Thymeleaf
  - Maven
  - MySql

