const info = document.getElementById("info");
const postM = document.getElementById("post");
const putM = document.getElementById("put");
const deleteM = document.getElementById("delete");

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

const postMethod = async () => {
    try {
        const res = await fetch("http://127.0.0.1:3000/user", {
            method: "POST",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                payload: "got it?"
            })
        });
        const data = await res.json();
        info.innerText = data.payload;
    } catch (error) {
        info.innerText = error;
    }
}
postM.onclick = postMethod;