const users = document.getElementById("users");
const input = document.getElementById("input");
const send = document.getElementById("send");
const chat = document.getElementById("chat");

const socket = io("http://127.0.0.1:3000");

let userName = "";

const onUserOnConnect = (user) => {
  userName = user || `User${Math.floor(Math.random() * 1_000_000)}`;
  socket.emit("new-user-connected", userName);
  newUser(userName);
};

const newUser = (user) => {
  if (document.querySelector(`.${user}-userlist`)) return;
  const newUserdiv = `
    <div class="${user}-userlist">
      <p>${user}</p>
    </div>
  `;
  console.log(newUserdiv)
  users.innerHTML += newUserdiv;
};

window.onload = () => {
  onUserOnConnect();
}

socket.on("new-user-connectedd", (data) => {
  data.map((user) => newUser(user))
})

socket.on("user-disconnected", (data) => {
  document.querySelector(`.${user}-userlist`).remove();
})

