let phrase = prompt("entrez une phrase : ");
if (phrase.length > 2) {
    let premiereLettre = phrase.charAt(0);
    let derniereLettre = phrase.charAt(phrase.length - 1);
    let phraseModifiee = phrase.substring(1, phrase.length - 1);
    alert(premiereLettre);
    alert(derniereLettre);
    alert(phraseModifiee);
} else {
    alert("La phrase est trop courte");
}