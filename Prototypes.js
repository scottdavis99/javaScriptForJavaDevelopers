// NOTE: Person isn’t an object literal
// Person is a function 
// (using prototypes to share a function instance)

var Person = function(){
	this.name
	this.city	
}

Person.prototype.toString = function(){
	return this.name + " lives in " + this.city
}

var person = new Person()
person.name = "Scott Davis"
person.city = "Broomfield"

console.log(person.toString());
