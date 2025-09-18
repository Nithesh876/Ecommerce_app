const express = require('express');
const fs = require('fs');
const path = require('path');

const app = express();
const PORT = process.env.PORT || 3000;

// Route to serve JSON file contents
app.get('/data', (req, res) => {
  const filePath = path.join(customer-service/cutomer.service, 'package.json');
  
  fs.readFile(filePath, 'utf8', (err, data) => {
    if (err) {
      res.status(500).json({ error: 'Unable to read JSON file' });
    } else {
      res.json(JSON.parse(data));
    }
  });
});

// Start server
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
