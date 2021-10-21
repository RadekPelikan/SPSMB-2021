const info = document.getElementById("info");
const postB = document.getElementById("post-button");
const putB = document.getElementById("put-button");
const patchB = document.getElementById("patch-button");
const deleteB = document.getElementById("delete-button");

window.onload = async () => {
    try {
        const res = await fetch("http://127.0.0.1:3000/user", {
            method: "GET"
        });
        const data = await res.json();
        info.innerText = data.msg;
    } catch (error) {
        info.innerText = error;
    }
}

postB.onclick = async () => {
    try {
        const res = await fetch("http://127.0.0.1:3000/user", {
            method: "POST",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                payload: "POST"
            })
        });
        const data = await res.json();
        info.innerText = data.payload;
    } catch (error) {
        info.innerText = error;
    }
}
patchB.onclick = async () => {
    try {
        const res = await fetch("http://127.0.0.1:3000/user", {
            method: "PATCH",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                payload: "PATCH"
            })
        });
        const data = await res.json();
        info.innerText = data.payload;
    } catch (error) {
        info.innerText = error;
    }
}
putB.onclick = async () => {
    try {
        const res = await fetch("http://127.0.0.1:3000/user", {
            method: "PUT",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                payload: "Bruh"
            })
        });
        const data = await res.json();
        info.innerText = data.payload;
    } catch (error) {
        info.innerText = error;
    }
}
deleteB.onclick = async () => {
    try {
        const res = await fetch("http://127.0.0.1:3000/user", {
            method: "PUT",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                payload: "Bruh"
            })
        });
        const data = await res.json();
        info.innerText = data.payload;
    } catch (error) {
        info.innerText = error;
    }
}