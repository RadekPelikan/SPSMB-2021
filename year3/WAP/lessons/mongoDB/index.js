const mongoose = require("mongoose");
const express = require("express");
const morgan = require("morgan");
const cors = require("cors");
const app = express();
const PORT = 3000;

const bookRouter = require("./routes/book");

mongoose.connect(
  `mongodb+srv://admin:${process.env.MONGODB_PW}@cluster0.ufj0f.mongodb.net/Cluter0?retryWrites=true&w=majority`,
  {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  }
);

app.use(morgan("dev"));
app.use(cors());
app.use(express.json());

app.use("/book", bookRouter);

app.listen(PORT, () => console.log(`App is running on ${PORT}`));
