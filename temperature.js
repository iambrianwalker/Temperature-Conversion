const themeToggler = document.querySelector(".darkModeToggle");
document.getElementById("convertButton").addEventListener("click", function() {
  const temperature = parseFloat(document.getElementById("temperature").value);
  const type = document.getElementById("type").value;
  const convertTo = document.getElementById("convert").value;
  let result = 0;

  // Check if the input temperature is a valid number
  if (isNaN(temperature)) {
      alert("Please enter a valid temperature.");
      return;
  }

  // Perform the conversion based on the selected type
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
      default:
          alert("Invalid type selected.");
          return;
  }

  // Display the result rounded to 2 decimal places
  document.getElementById("result").innerText = `Converted temperature: ${result.toFixed(2)}`;
});

// Function to toggle dark mode
themeToggler.addEventListener('click', () => {
    document.body.classList.toggle('darkVariables'); // Apply dark mode class to body
});
