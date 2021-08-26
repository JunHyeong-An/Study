// const title = document.getElementById("something");

// title.innerText = "Got you!!"
// console.dir(title);
// console.log(title.id);
// console.log(title.className);

const title = document.querySelector(".hello h1");
// const hellos = document.getElementsByClassName("hello");
// const h1 = document.getElementsByTagName("h1");
// console.log(hellos);
// console.log(h1);
// console.log(title);


/////////////////////////////////////////

function handleTitleClick() {
    title.style.color = "blue";
}
function handleMouseEnter() {
    title.innerHTML = "Mouse is here!";
}
function handleMouseLeave() {
    title.innerHTML = "Mouse is gone!!";
}
function handleWindowResize() {
    document.body.style.backgroundColor = "tomato";
}
function handleWindowCopy() {
    alert("copier!!");
}

title.addEventListener("click", handleTitleClick);
title.addEventListener("mouseenter", handleMouseEnter);
title.addEventListener("mouseleave", handleMouseLeave);

window.addEventListener("resize", handleWindowResize);
window.addEventListener("copy", handleWindowCopy);
window.addEventListener("")