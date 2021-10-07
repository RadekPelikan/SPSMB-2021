const express = require("express");
const app = express();
const PORT = 3000;

app.get("/user", (req, res) => {
    res.status(200).send({
        msg: "negr"
    })
})

app.listen(PORT, () => console.log(`Server is running on ${PORT}`))