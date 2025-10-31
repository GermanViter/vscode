public class Livre {
    String titre;
    String auteur;
    int annee;
    boolean emprunte;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.emprunte = false;
    }

    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("Vous avez emprunté ce livre!!!");
        } else {
            System.out.println("Ce livre n'est pas disponible pour emprunt!");
        }
    }

    public void remetre() {
        if (emprunte) {
            emprunte = false;
            System.out.println("Vous avez remis ce livre!!!");
        } else {
            System.out.println("Vous ne possedez pas ce livre!!!");
        }
    }

    public void afficher() {
        System.out.printf("""
                Nom du livre : %s
                Auteur : %s
                Année de publication : %d
                État : %s
                """, titre, auteur, annee, (emprunte ? "Emprunté" : "Disponible"));
        System.out.println();
    }
}