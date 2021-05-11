/**
 * 
 */
let targetForm = document.getElementById("secessionForm");

let secessionSubmit = () => {
    targetForm.submit();
}

document.getElementById("leave").onclick = secessionSubmit