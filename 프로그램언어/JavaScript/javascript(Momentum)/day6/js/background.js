const images = [
    "0.jpg",
    "1.jpg",
    "2.jpg"
];

const choosenImage = images[Math.floor(Math.random() * images.length)];
const img = document.createElement("img");

img.src = `/imgs/${choosenImage}`;
img.width = 1920;
img.height = 1080;
console.log(img);

document.body.appendChild(img);