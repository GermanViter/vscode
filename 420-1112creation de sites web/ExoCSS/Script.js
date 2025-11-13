let options = ["roche", "papier", "ciseaux"];
let choixOrdi = Math.floor(Math.random() * 3);
let compteurJ = 0;
let compteurO = 0;

while (true) {
    let choixJoueur = prompt("Choisiscez votre options (roche papier cixeaux) ([0] poour quitter)");

    if ((choixJoueur == "roche" && choixOrdi == options.indexOf("papier")) ||
        (choixJoueur == "papier" && choixOrdi == options.indexOf("ciseaux")) ||
        (choixJoueur == "ciseaux" && choixOrdi == options.indexOf("roche"))) {

        compteurO++;
        alert("Le bot a gagné");
        alert("Score Joueur : " + compteurJ);
        alert("Score Bot : " + compteurO);

    } else if ((choixJoueur == "papier" && choixOrdi == options.indexOf("roche")) ||
        (choixJoueur == "ciseaux" && choixOrdi == options.indexOf("papier")) ||
        (choixJoueur == "roche" && choixOrdi == options.indexOf("papier"))) {

        compteurJ++;
        alert("Le joueur a gagné");
        alert("Score Joueur : " + compteurJ);
        alert("Score Bot : " + compteurO);
    } else {
        alert("égalité");
    }

    if (choixJoueur == 0) {
        alert("Merci d'avoir joué");
        break;
    }
}