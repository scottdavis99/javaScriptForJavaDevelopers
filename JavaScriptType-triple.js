console.log(1 === 1)                         //true
console.log("JavaScript" === "JavaScript");  //true

console.log(1 === true);                     //FALSE!
console.log(0 === false);                    //FALSE!
console.log("" === false);                   //FALSE!
console.log("0" === false);                  //FALSE!

console.log("true" === true);                //FALSE!
console.log(false === "false");              //FALSE!

console.log(0 === "0");                      //FALSE!
console.log(0 === "");                       //FALSE!
console.log("" === "0");                     //FALSE!

var lang = "JavaScript"
var anotherLang = new String("JavaScript")
console.log(lang === anotherLang);           //FALSE!
















