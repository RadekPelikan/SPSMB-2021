const express = require("express");
const morgan = require("morgan");
const path = require("path");
const cors = require("cors");
const app = express();
const PORT = 3000;

const imageRouter = require("./routes/image");

app.use(morgan("dev"));
app.use(cors());
app.use(express.json());

app.set("views", path.join(__dirname, "views"));
app.set("view engine", "pug");
app.use(express.static(path.join(__dirname, "public")));

app.use('/', imageRouter);

app.listen(PORT, () => console.log(`App is running on ${PORT}`));
