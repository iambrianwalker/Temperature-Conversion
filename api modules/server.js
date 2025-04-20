const express = require('express');
const cors = require('cors');
const fs = require('fs');
const path = require('path');
const app = express();

// Middleware
app.use(cors()); // Enables CORS for your entire application
app.use(express.json()); // Parses JSON request bodies

// Load weather facts from the file
const filePath = path.join(__dirname, '/../weatherFacts/weatherFacts.txt');
let weatherFacts = [];

try {
    const data = fs.readFileSync(filePath, 'utf-8');
    weatherFacts = data.split('\n').filter(line => line.trim() !== '');
} catch (error) {
    console.error('Error reading weatherFacts.txt:', error);
}

app.post('/convert', (req, res) => {
    const { temperature, type, convertTo } = req.body;
    let result;

    if (isNaN(temperature) || !type || !convertTo) {
        return res.status(400).json({ error: 'Invalid input data.' });
    }

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
            return res.status(400).json({ error: 'Invalid type.' });
    }

    // Pick a random weather fact
    const randomFact = weatherFacts[Math.floor(Math.random() * weatherFacts.length)];

    // Include the random fact in the response
    res.json({ convertedTemp: result, convertTo, randomWeatherFact: randomFact });
});

const PORT = 4000;
app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});