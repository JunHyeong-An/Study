const title = document.querySelector("#title");

function handleMouseEnter() {
    title.innerHTML = "The mouse is here!!";
    this.style.color = "blue";
}
function handleMouseLeave() {
    title.innerHTML = "The mouse is gone!!";
    this.style.color = "tomato";
}
function handleWindowResize() {
    title.innerHTML = "You just resized!";
    title.style.color = "green";
}
function handleContextMenuClick() {
    title.innerHTML = "That was right click!";
    title.style.color = "red";
}

title.addEventListener("mouseenter", handleMouseEnter);
title.addEventListener("mouseleave", handleMouseLeave);
window.addEventListener("resize", handleWindowResize);
document.addEventListener("contextmenu", handleContextMenuClick);