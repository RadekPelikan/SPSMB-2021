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
    socket.data.userName = data;
    activeUsers.add(data);
    socket.broadcast.emit("new-user-connected", [...activeUsers] );
  });

  socket.on("disconnect", () => {
    console.log(`${socket.data.userName} disconnected`);
    activeUsers.delete(socket.data.userName);
    io.emit("user-disconnected", socket.data.userName);
  });
});

server.listen(PORT, () => {
  console.log(`App is running on ${PORT}`);
});
