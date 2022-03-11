const users = document.getElementById("users");
const input = document.getElementById("input");
const send = document.getElementById("send");
const chat = document.getElementById("chat");

const socket = io("http://127.0.0.1:3000");

let userName = "";

const onUserConnect = (user) => {
  userName = user || `User${Math.floor(Math.random() * 1_000_000)}`;
  document.title = userName
  newUser(userName, true);
  socket.emit("new-user-connected", userName);
};

const newUser = (user, here) => {
  if (document.querySelector(`.${user}-userlist`)) return;
<<<<<<< HEAD
  const newUserDiv = `
        <div class="${user}-userlist">
            <p>${user}</p>
        </div>
    `;
  users.innerHTML += newUserDiv;
};

window.onload = () => {
  onUserConnect();
};

socket.on("new-user-connected", (data) => {
  data.map((user) => newUser(user));
});

socket.on("user-disconnected", (user) => {
  document.querySelector(`.${user}-userlist`).remove();
});

socket.on("chat", (data) => {
  chat.innerHTML += `<p>${data}</p>`;
});

send.onclick = () => {
  socket.emit("chat", `${userName}: ${input.value}`);
  input.value = "";
};
=======
  here = here ? " - local" : "";
  const newUserdiv = `
    <div class="${user}-userlist">
      <p>${user}${here}</p>
    </div>
  `;
  users.innerHTML += newUserdiv;
};

window.onload = () => {
  onUserOnConnect();
};

socket.on("new-user-connected", (data) => {
  console.log(data)
  data.map((user) => newUser(user, false));
});

socket.on("user-disconnected", (data) => {
  document.querySelector(`.${data}-userlist`).remove();
});
>>>>>>> c319fcd5b34a5717818520c585d1aeff4c6ebd51
