let anneDeNaissance = prompt("Entrez votre annee de naissance : ");
let anneeActuelle = new Date();
let age = anneeActuelle.getFullYear() - anneDeNaissance.getFullYear();

if (age > 18) {
    alert("Majeur");
} else {
    alert("Mineur");
}
