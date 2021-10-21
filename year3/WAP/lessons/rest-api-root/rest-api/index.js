const express = require("express");
const cors = require("cors");
const app = express();
const PORT = 3000;

app.use(cors());
app.use(express.json());

/**
 * GET /user
 * Purpose: 
 */
app.get("/user", (req, res) => {
    res.status(200).send({
        msg: "seems good"
    })
})

app.post('/user', (req, res) => {
    const { payload } = req.body;
    console.log(payload);
    res.status(201).send({
        payload: "yep"
    });
})

app.get('/user/:id', (req, res) => {
    const { payload } = req.body;
    if (!payload) return res.status(404).send({ msg: "Payload not found" });
    res.status(200).send({
        payload
    })
})

app.put('/user', (req, res) => {
    const { payload } = req.body;
    if (!payload) return res.status(404).send({ msg: "Payload not found" });
    res.status(200).send({
        payload
    })
})

app.patch('/user', (req, res) => {
    const { payload } = req.body;
    if (!payload) return res.status(404).send({ msg: "Payload not found" });
    res.status(200).send({
        payload
    })
})

app.delete('/user', (req, res) => {
    const { payload } = req.body;
    if (!payload) return res.status(404).send({ msg: "Payload not found" });
    res.status(200).send({
        payload
    })
})


app.listen(PORT, () => console.log(`Server is running on ${PORT}`))