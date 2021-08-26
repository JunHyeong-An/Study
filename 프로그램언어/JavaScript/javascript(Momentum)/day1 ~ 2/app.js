// always 'const' sometimes 'let' never 'var'

const a = 5;
const b = 2;
const myName = "nico";
let myName2 = "nico";

const veryLongVariableName = 0; // javascript
const very_long_variable_name = 0; //python

console.log(a + b);
console.log(a * b);
console.log(a / b);
console.log("hello " + myName);

myName2 = "noloras";

console.log("Your New Name is " + myName2);

///////////////////////////////////////////////////////////

const amIFat = true;
// on memory, it have space but no value
// null is never happend automaticly
// null means empty
let something;
console.log(something)
console.log(amIFat);

const amIFat2 = null;
console.log(null);

///////////////////////////////////////////////////////////

const mon = "mon";
const tue = "tue";
const wed = "wed";
const thu = "thu";
const fri = "fri";
const sat = "sat";
const sun = "sun";

const daysOfWeek = [mon, tue, wed, thu, fri, sat, sun];
const nonsense = [1, 2, "hello", false, null, true, undefined, "name"];

console.log(daysOfWeek);
daysOfWeek.push("sun");
console.log(daysOfWeek);

const apple = "apple";
const potato = "potato";

const toBuy = [apple, potato, "pizza"];

toBuy.push("kimbab");

console.log(toBuy);

////////////////////////////////////////////////////////

// const playerName = "nico";
// const playerPoints = 121212;
// const playerHandsome = true;
// const playerFat = "little bit";

const player = {
    name : "nico",
    points : 12121212,
    handsome : true,
    fat : "little bit"
};

console.log(player["name"]);
console.log(player.name);
player.fat = false;

console.log(player.fat);
player.lastName = "potato";
console.log(player.lastName);
player.points = 15;
player.points += 15;

console.log(player.points);
// why can we modify the const variable? because it change something inside of player