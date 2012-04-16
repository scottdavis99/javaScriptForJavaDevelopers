
var person = {
	name: "Scott Davis",
	city: "Broomfield",
	toString: function(){
	  return this.name + " lives in " + this.city
	}
}

var person2 = {
	name: "Venkat Subramaniam",
	city: "Broomfield",
	toString: function(){
	  return this.name + " lives in " + this.city
	}
}

console.log(person.toString());