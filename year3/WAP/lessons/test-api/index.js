const express = require("express");
const morgan = require("morgan");
const cors = require("cors");
const app = express();
const PORT = 3000;

const petRouter = require("./routes/pet");
const storeRouter = require("./routes/store");
const userRouter = require("./routes/user");

app.use(morgan("dev"));
app.use(cors());
app.use(express.json());

// app.use("/pet", petRouter);
app.use("/store", storeRouter);
app.use("/user", userRouter);

app.listen(PORT, () => console.log(`App is running on ${PORT}`));
