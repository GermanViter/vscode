let email = prompt("entrez votre email : ");
let containsA = email.includes("@");
let containsDot = email.includes(".");
let dotAfterAt = email.indexOf("@") > email.indexOf(".");

alert(containsA && containsDot && dotAfterAt);