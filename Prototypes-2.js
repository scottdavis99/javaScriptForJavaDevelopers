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


var person2 = new Person()
person2.name = "Venkat Subramaniam"
person2.city = "Broomfield"
person2.state = "CO"
person2.toString = function(){
  return this.name + " won’t tell you where he lives"
}
console.log(person2.toString());

