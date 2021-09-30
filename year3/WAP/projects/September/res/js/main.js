const initSlide = document.getElementById("button");
const levelBlock = document.getElementById("question-wrapper");
const questionText = document.getElementById("question");
const buttonsBLock = document.getElementById("button-wrapper");
let answerButtons = [];
// TODO: Checking for corrent answer is -1, cuz it starts from. its 1 to `n`
let questions;
let currentQ = 0;
let isSwitching = false;

const readFile = async () => {
    try {
        const file = await fetch("/res/json/data.json");
        return await file.json();
    } catch (e) {
        console.log(e);
        
    }
};

const changeQuestionText = () => {
    let question;
    try {
        question = questions[currentQ]["question"];
    } catch {
        question = "Už žádné otázky, došly";
    }
    questionText.innerText = question;
};

const HandleNextQuestion = () => {
    // TODO: After clicking for new question increment the currentQ
    if (isSwitching) {
        return;
    }

    levelBlock.classList.add("next-question");
    isSwitching = true;

    setTimeout(() => {
        // generateAnswerButtons();
        changeQuestionText();
        // currentQ++;
    }, 500);

    setTimeout(() => {
        levelBlock.classList.remove("next-question");
        isSwitching = false;
    }, 2100);
};
initSlide.onclick = HandleNextQuestion;

const generateButtons = () => {
    questions[currentQ]["answers"].forEach(text => createButton(text));
}

const createButton = (answerText) => {
    let button = document.createElement("button");
    buttonsBLock.appendChild(button);
    button.innerText = text;
    button.classList.add("button");
    answerButtons.push(button);

};

window.onload = async () => {
    questions = await readFile();
    console.log(questions);
};