const express = require("express");

const app = express();
app.use(express.json());
const port = 3000;


const people = [
    { "id": 1, "firstname": "Hans", "lastname": "Müller", "age": 17 },
    { "id": 2, "firstname": "Anna", "lastname": "Schmidt", "age": 22 },
    { "id": 3, "firstname": "Lukas", "lastname": "Meier", "age": 19 },
    { "id": 4, "firstname": "Sophia", "lastname": "Lehmann", "age": 21 },
    { "id": 5, "firstname": "Felix", "lastname": "Wagner", "age": 18 },
    { "id": 6, "firstname": "Laura", "lastname": "Becker", "age": 20 },
    { "id": 7, "firstname": "Niklas", "lastname": "Hoffmann", "age": 23 },
    { "id": 8, "firstname": "Mia", "lastname": "Schneider", "age": 16 },
    { "id": 9, "firstname": "Tim", "lastname": "Krause", "age": 25 },
    { "id": 10, "firstname": "Emma", "lastname": "Schäfer", "age": 24 }
]


app.get('/people', async (req, res) => {
    res.send(people);
});

app.post('/person', async (req, res) => {
    let person = req.body;
    people.push(person);
    res.send(person);
});

app.delete('/person/:id', async (req, res) => {
    const id = parseInt(req.params.id);
    const index = people.findIndex(person => person.id === id);
    people.splice(index, 1);
    res.send(req.params.id);
});


app.listen(port, () => {
    //console.log(`Hello world app listening on port ${port}!`)
})