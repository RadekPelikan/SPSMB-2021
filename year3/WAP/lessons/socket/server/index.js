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

io.on("connection", (socket) => {
  console.log("New connection");

  socket.on("new-user-connected", (data) => {
    console.log(`${data} connected`);
    socket.data.user = data;
    activeUsers.add(data);
    io.emit("new-user-connected", [...activeUsers]);
  });

  socket.on("chat", (data) => {
    io.emit("chat", data);
  });

  socket.on("disconnect", () => {
    console.log(`${socket.data.user} disconnected`);
    activeUsers.delete(socket.data.user);
    io.emit("user-disconnected", socket.data.user);
  });
});

server.listen(PORT, () => console.log(`Server is running on ${PORT}`));
