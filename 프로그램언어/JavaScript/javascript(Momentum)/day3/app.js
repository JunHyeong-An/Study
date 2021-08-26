// programer is lazy!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
function printHello(name) {
    console.log("Hello my name is s" + name);
}

printHello("john");

function plus(a, b) {
    return a + b;
}

let result = plus(2, 3);
console.log(result);

const me = "good";
const days = [1, 2, false, true, null, undefined, "text", me];

const toBuy = ["potato", "tomato", "pizza"];

console.log(toBuy[2]);
toBuy[2] = "water";
console.log(toBuy[2]);

const player = {
    name: "john",
    age : 18
};

console.log(player);

////////////

const calculate = {
    add : function(a, b) {
        console.log(a + b);
    },
    minus : function(a, b) {
        console.log(a - b);
    },
    devide : function(a, b) {
        console.log(a / b);
    },
    power : function(a, b) {
        console.log(a ** b);
    }
}

calculate.add(1,2);
calculate.minus(1,2);
calculate.devide(1,2);
calculate.power(2,2);

const age = 96;
function calculateKrAge(ageOfForeigner) {
    return ageOfForeigner + 2;
}

console.log(calculateKrAge(age));
//Nan = Not a Number