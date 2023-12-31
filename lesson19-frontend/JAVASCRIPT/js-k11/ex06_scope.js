// global object - execution context
// scope chain: var, let, const

// ES5: var = global variable --> global execution context
// web browser: var --> window (global object)
// var name5 = 'Yaya Toure';
// var age5 = 36; // ===> age = window.age
// name5 = 'Yaya Smith';
// console.log(`${name5} - ${age5}`);


// ES6 - ES2015 --> let, const
// const name6 = 'Yaya Toure';
// let age6 = 36; // ===> age = window.age
// name6 = 'Yaya Smith';
// console.log(`${name6} - ${age6}`);

// let, const: block scope
// var: function scope

// ES5
function driversLincence5(passedTest) {
	if (passedTest) {
		var firstName = 'John';
		var yearOfBirth = 1998;
	}
	console.log(`${firstName} born in ${yearOfBirth}, now is allowed to drive a car`);
}
driversLincence5(true);

function driversLincence6(passedTest) {
	if (passedTest) {
		let firstName = 'John';
		const yearOfBirth = 1998;
		console.log(`${firstName} born in ${yearOfBirth}, now is allowed to drive a car`);
	}
}
driversLincence6(true);
let i = 20;
for (let i = 0; i < 5; i++) {
	console.log('i: ' + i);
}
console.log(i);