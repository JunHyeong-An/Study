let targetTextArea = document.getElementById("introduceWrite");

let changeText = () => {
    document.getElementById("submitDiv").style.display = 'flex';
}

targetTextArea.onchange = changeText;