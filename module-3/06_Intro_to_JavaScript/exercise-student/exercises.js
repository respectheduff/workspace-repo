/*
1. **sumDouble** Given two int values, return their sum. Unless the two values are the 
    same, then return double their sum.

		sumDouble(1, 2) → 3
		sumDouble(3, 2) → 5
		sumDouble(2, 2) → 8
*/
 function sumDouble(a, b) {

	if (a === b) {
		return 2 * (a + b);
	} else {
		return a + b;
	}
}

/*
2. **hasTeen** We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 3 int values, return true if 1 or more of them are teen.

		hasTeen(13, 20, 10) → true
		hasTeen(20, 19, 10) → true
		hasTeen(20, 10, 13) → true
*/
		// function hasTeen(number1, number2, number3){
		// 	const number1 = "";
		// 	const number2 = "";
		// 	const number3 = "";
		// 	if( number1 >= 13 || number1 <= 19){
		// 		return true;
		// 	}
		// 	if( number2 >= 13 || number2 <= 19){
		// 		return true;
		// 	}
		// 	if( number3 >= 13 || number3 <= 19){
		// 		return true;
		// 	}
		// 	return false;
			
		// }
/* 
3. **lastDigit** Given two non-negative int values, return true if they have the same 
    last digit, such as with 27 and 57.

		lastDigit(7, 17) → true
		lastDigit(6, 17) → false
		lastDigit(3, 113) → true
*/
function lastDigit( num1, num2) {

}
/*
4. **seeColor** Given a string, if the string begins with "red" or "blue" return that color 
    string, otherwise return the empty string.

		seeColor("redxx") → "red"
		seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"
*/

/*
5. **oddOnly** Write a function that given an array of integer of any length, filters out 
	the even number, and returns a new array of just the the odd numbers.
	
	something has to return true to be included something has to be false to be excluded
	ex: if (name === tom){ return false; }

		oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) → [1, 3, 5, 7, 9, 11];
		oddOnly([2, 4, 8, 32, 256]); → []
*/
function oddOnly([]) {
	const filteredArray = numbersToFilter.filter((number)=> {
		return number % 2 != 0;
	})
	return filteredArray;

}

/*
6. **frontAgain** Given a string, return true if the first 2 chars in the string also appear 
    at the end of the string, such as with "edited".

		frontAgain("edited") → true
		frontAgain("edit") → false
		frontAgain("ed") → true
*/
function frontAgain(str ="") {
	const frontTwo = str.substring(0,2);
	const backTwo = str.substring(str.length - 2);
	const result = (frontTwo === backTwo);
	return result;
}
/*
7. **cigarParty** When squirrels get together for a party, they like to have cigars. 
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
Write a squirrel party function that return true if the party with the given values is successful, 
or false otherwise.

		cigarParty(30, false) → false
		cigarParty(50, false) → true
		cigarParty(70, true) → true
*/
 function cigarParty(cigars, isWeekend) {
	const minimumCigarCount = 40;
	const maximumCigarCount = 60;

	 hasMinimumCigars = cigars >= minimumCigarCount;
	 withinMaxRangeOfCigars = (!isWeekend && cigars <= maximumCigarCount) || isWeekend;
	 successful = hasMinimumCigars && withinMaxRangeOfCigars;

	return successful;
}
/*
8. **fizzBuzz** Because you know you can't live without it, FizzBuzz.

		fizzBuzz(3) → "Fizz"
		fizzBuzz(1) → 1
		fizzBuzz(10) → "Buzz"
		fizzBuzz(15) → "FizzBuzz"
		fizzBuzz(8) → 8
*/
	function fizzBuzz(number) {
		let output = "";

		if (number % 3 === 0 ) {
			output += "Fizz";
		}
		if (number % 5 === 0 ) {
			output += "Buzz";
		}
		return output || number;

	}
/*
9. **filterEvens** Write a function that filters an array to only include even numbers.

	filterEvens([]) → []
	filterEvens([1, 3, 5]) → []
	filterEvens([2, 4, 6]) → [2, 4, 6]
	filterEvens([100, 8, 21, 24, 62, 9, 7]) → [100, 8, 24, 62]
*/
function filterEvens([]){
const filteredArray = numbersToFilter.filter((number)=> {
	return number % 2 === 0;
})
return filteredArray;

}
/*
10. **filterBigNumbers** Write a function that filters numbers greater than or equal to 100.

	filterBigNumbers([7, 10, 121, 100, 24, 162, 200]) → [121, 100, 162, 200]
	filterBigNumbers([3, 2, 7, 1, -100, -120]) → []
	filterBigNumbers([]) → []
*/
function filterBigNumbers([]){
	const filteredArray = numbersToFilter.filter((number)=> {
		return number >= 100;
	})
	return filteredArray;
	
	}
/*
11. **filterMultiplesOfX** Write a function to filter numbers that are a multiple of a 
parameter, `x` passed in.

	filterMultiplesOfX([3, 5, 1, 9, 18, 21, 42, 67], 3) → [3, 9, 18, 21, 42]
	filterMultiplesOfX([3, 5, 10, 20, 18, 21, 42, 67], 5) → [5, 10, 20]
*/
function filterMultiplesOfX(numbers, x) {
	return numbers.filter((number) => {
		return number % x === 0;
	});
}
/*
12. **createObject** Write a function that creates an object with a property called 
firstName, lastName, and age. Populate the properties with your values.

	createObject() →

	{
		firstName,
		lastName,
		age
	}
*/
function createObject() {
	const me = {
		firstName: "Josh",
		lastName: "littles",
		age: 29
	};
	return me;
}