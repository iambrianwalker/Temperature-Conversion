# Temperature Converter - Java Swing Application

## Project Overview
The **Temperature Converter** is a standalone Java application built using Swing. It provides a user-friendly graphical interface for converting temperatures between Fahrenheit, Celsius, and Kelvin.

This project encapsulates temperature conversion logic directly within the program and is ideal for desktop-based environments.

## Features
- **Graphical User Interface (GUI)**: Built using Java Swing for an intuitive user experience.
- **Temperature Conversion**: Supports conversions between Fahrenheit, Celsius, and Kelvin.
- **Error Handling**: Alerts users if invalid input is entered.
- **Compact Design**: Designed to fit seamlessly into a small desktop window.

## Installation and Setup
### Prerequisites
1. Java Development Kit (JDK) installed on your system (Version 8 or higher recommended).
2. An IDE like IntelliJ IDEA, Eclipse, or NetBeans (optional for editing the code).

### Steps
1. Copy the `userInterface.java` file into a new Java project in your IDE.
2. Compile and run the program:
   ```bash
   javac userInterface.java
   java userInterface
   ```
3. The application window will launch, allowing you to perform temperature conversions.

## Usage
### Temperature Conversion
1. Enter the temperature value in the input field.
2. Select the temperature unit (Fahrenheit, Celsius, or Kelvin) from the dropdown.
3. Select the unit to convert to from the second dropdown.
4. Click the "Convert" button to view the converted value displayed on the screen.

### Error Handling
- If an invalid temperature or unsupported unit is entered, the program will display an error message.
- Handles numeric input validation to prevent crashes or incorrect calculations.

## Code Structure
### Conversion Methods
1. **Fahrenheit Conversion**:
    ```java
    private static double fahrenheit(double n, char t) { 
        // Converts temperature to Fahrenheit based on input type
    }
    ```
2. **Celsius Conversion**:
    ```java
    private static double celsius(double n, char t) { 
        // Converts temperature to Celsius based on input type
    }
    ```
3. **Kelvin Conversion**:
    ```java
    private static double kelvins(double n, char t) { 
        // Converts temperature to Kelvin based on input type
    }
    ```

### User Interface
1. **Swing Components**:
    - `JLabel`: Displays labels for input fields and results.
    - `JTextField`: Allows users to input temperature values.
    - `JComboBox`: Dropdown menus for selecting input and output temperature units.
    - `JButton`: Button for triggering the conversion logic.
    - `JOptionPane`: Used for displaying error messages and alerts.

2. **Layout and Placement**:
    - All GUI components are organized within a `JPanel` with manual positioning for simplicity.

## Example
### Conversion Flow
- **Input**: `100°F`
- **Convert to**: `Celsius`
- **Result**: `37.78°C`

## License
This project is licensed under the **ISC License** (or another license of your choice).

## Author
Created by **Brian Walker and Nadia Thorton**.
