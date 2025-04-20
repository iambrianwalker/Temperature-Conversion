## TempConvrt - Temperature Conversion Utility

### Overview

TempConvrt is a simple Java-based application designed to convert temperatures between Fahrenheit, Celsius, and Kelvin. This program provides a command-line interface to input temperature values and specify their corresponding units for conversion.

### Key Features

- **Multi-Unit Conversion**: Converts temperatures between Fahrenheit, Celsius, and Kelvin.
- **User-Friendly Interface**: Simple and intuitive command-line prompts for input.
- **Error Handling**: Provides user feedback for invalid inputs.

### How It Works

1. **Temperature Input**: The user is prompted to enter a temperature value.
2. **Unit Specification**: The user specifies the current unit of the temperature (F, C, or K).
3. **Conversion**: The user specifies the target unit for conversion. The program processes the input and converts the temperature accordingly.
4. **Output**: The converted temperature is displayed to the user.

### Methods

- `fahrenheit(double n, char t)`: Converts the given temperature to Fahrenheit from either Kelvin or Celsius.
- `celsius(double n, char t)`: Converts the given temperature to Celsius from either Fahrenheit or Kelvin.
- `kelvins(double n, char t)`: Converts the given temperature to Kelvin from either Fahrenheit or Celsius.

### Example Usage

Run the program, follow the prompts to enter the temperature value, its unit, and the desired target unit. The program will then output the converted temperature.
