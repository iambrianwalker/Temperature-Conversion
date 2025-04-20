# Temperature Converter

## Project Overview
The **Temperature Converter** is a lightweight web application designed to convert temperatures between Celsius, Fahrenheit, and Kelvin. This version operates entirely client-side, with the conversion logic written directly into the HTML and JavaScript. It is a standalone tool that doesn't require any back-end server or API integration.

## Features
- **Temperature Conversion**: Convert values between Celsius, Fahrenheit, and Kelvin directly within the browser.
- **Responsive Design**: Adapts gracefully to various screen sizes for optimal usability.
- **Dark Mode**: Switch between light and dark themes for enhanced user experience.

## Installation
### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/iambrianwalker/temperature-converter.git
   ```
2. Navigate to the project folder and ensure you have the following files:
   - `temperature.html`: The structure and interface of the application.
   - `temperature.css`: Styling for the application, including light and dark mode themes.
   - `temperature.js`: Contains the conversion logic and dark mode functionality.

3. Open `temperature.html` in your web browser to use the application.

## Usage
### Temperature Conversion
1. Enter a temperature value in the input field.
2. Select the input temperature type (Celsius, Fahrenheit, or Kelvin).
3. Select the unit to convert to.
4. Click the "Convert" button to display the result on the screen.

### Dark Mode
Click the "Dark Mode" button located at the top-right corner to toggle between light and dark themes.

## Example Code Snippets
### Conversion Logic in `temperature.js`
```javascript
document.getElementById("convertButton").addEventListener("click", function() {
    const temperature = parseFloat(document.getElementById("temperature").value);
    const type = document.getElementById("type").value;
    const convertTo = document.getElementById("convert").value;

    if (isNaN(temperature)) {
        alert("Please enter a valid temperature.");
        return;
    }

    let result;
    switch (type) {
        case "F":
            result = convertTo === "C" ? (temperature - 32) * 5 / 9 :
                     convertTo === "K" ? (temperature - 32) * 5 / 9 + 273.15 : temperature;
            break;
        case "C":
            result = convertTo === "F" ? (temperature * 9 / 5) + 32 :
                     convertTo === "K" ? temperature + 273.15 : temperature;
            break;
        case "K":
            result = convertTo === "C" ? temperature - 273.15 :
                     convertTo === "F" ? (temperature - 273.15) * 9 / 5 + 32 : temperature;
            break;
    }

    document.getElementById("result").innerText = `Converted temperature: ${result.toFixed(2)}°${convertTo}`;
});
```

### Dark Mode in `temperature.js`
```javascript
const darkModeToggle = document.querySelector('.darkModeToggle');
darkModeToggle.addEventListener('click', () => {
    document.body.classList.toggle('dark-mode');
    darkModeToggle.textContent = document.body.classList.contains('dark-mode') ? 'Light Mode' : 'Dark Mode';
});
```

## Authors
Developed by **Brian Walker and Nadia Thorton**.

## License
This project is licensed under the **ISC License**.
