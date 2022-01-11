const express = require("express");
const http = require("http");
const { Server } = require("socket.io");

const app = express();
const server = http.createServer(app);
const io = new Server(server, {
  cors: {
    origin: "*",
  },
});
const PORT = 3000;

const activeUsers = new Set();

app.use(express.json());

app.use(express.static("public"));

io.on("connection", (socket) => {
  console.log("New connection");

  socket.on("new-user-connected", (data) => {
    console.log(`${data} connected`);
    socket.data.user = data;
    activeUsers.add(data);
    socket.emit("new-user-connected", [...activeUsers]);
  });

  socket.on("disconnect", () => {
    console.log(`${socket.data.user} disconnected`);
    activeUsers.delete(socket.data.user);
    io.emit("user-disconnected", socket.data.user);
  });
});

server.listen(PORT, () => {
  console.log(`App is running on ${PORT}`);
});
