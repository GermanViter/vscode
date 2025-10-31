import java.util.ArrayList;

public class Bibliotheque {
    String nom;
    ArrayList<Livre> livres = new ArrayList<>();

    public Bibliotheque(String nom) {
        this.nom = nom;
    }

    public void ajouterLivre(Livre l) {
        livres.add(l);
        System.out.println("Livre ajouté : " + l.titre);
    }

    public void afficherLivres() {
        System.out.println("\nListe des livre de " + nom + " : ");
        for (Livre livre : livres) {
            livre.afficher();
        }
    }

    public Livre rechercher(String titre) {
        for (Livre livre : livres) {
            if (livre.titre.equalsIgnoreCase(titre)) {
                return livre;
            }
        }
        return null;
    }
}