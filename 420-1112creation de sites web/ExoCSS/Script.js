let mot = prompt("Écrivez un mot : ");
let motMin = mot.toLowerCase();

let debut = 0;
let fin = mot.length - 1;
let estUnPalindrome = true;

while (debut < fin) {
    

    if (motMin.charAt(debut) != motMin.charAt(fin)) {
        estUnPalindrome = false;
        break;
    }
    debut++;
    fin--;
}

alert(estUnPalindrome ? "Le mot est un palindrome" : "Le mot n'est pas un palindrome");