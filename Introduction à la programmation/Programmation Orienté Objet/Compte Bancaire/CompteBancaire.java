public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) {
        if (this.solde - montant < 0) {
            System.out.println("Vous ne pouvez pas retirer cette somme");
        } else {
            this.solde -= montant;
        }
    }

    public void afficherSolde() { 
        System.out.println("Votre solde : " + this.solde);
    }
}