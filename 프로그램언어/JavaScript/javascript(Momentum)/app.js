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