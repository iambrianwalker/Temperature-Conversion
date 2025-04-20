// Select the dark mode toggle button
const darkModeToggle = document.querySelector('.darkModeToggle');

// Add an event listener to the button
darkModeToggle.addEventListener('click', () => {
    // Toggle the 'darkVariables' class on the body to switch themes
    document.body.classList.toggle('darkVariables');
    
    // Update the button text based on the mode
    if (document.body.classList.contains('darkVariables')) {
        darkModeToggle.textContent = 'Light Mode';
    } else {
        darkModeToggle.textContent = 'Dark Mode';
    }
});
document.getElementById("convertButton").addEventListener("click", async function() {
    const temperature = parseFloat(document.getElementById("temperature").value);
    const type = document.getElementById("type").value;
    const convertTo = document.getElementById("convert").value;

    // Check if the input temperature is valid
    if (isNaN(temperature)) {
        alert("Please enter a valid temperature.");
        return;
    }

    try {
        // Send the data to the API
        const response = await fetch('http://localhost:4000/convert', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ temperature, type, convertTo })
        });

        // Parse the API response
        const data = await response.json();
        if (data.error) {
            alert(data.error);
        } else {
            document.getElementById("result").innerText = 
                `Converted temperature: ${data.convertedTemp.toFixed(2)}°${data.convertTo}`;

            // Add this to display the random weather fact
            document.getElementById("weatherFact").innerText = 
                `${data.randomWeatherFact}`;
        }
    } catch (error) {
        console.error('Error:', error);
        alert('There was a problem connecting to the API.');
    }
});
