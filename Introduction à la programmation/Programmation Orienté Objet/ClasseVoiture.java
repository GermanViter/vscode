import java.util.Random;

public class ClasseVoiture {
    public static void main(String[] args) {
        Random rand = new Random();
        
        Voiture v1 = new Voiture("Toyota", "Supra", 0);
        Voiture v2 = new Voiture("Lamborghini", "Huracan", 0);
        Voiture v3 = new Voiture("Ferrari", "La Ferrari", 0);

        for (int tour = 0; tour <= 5; tour++) {
            v1.accelerer(rand.nextInt(31) + 10);
            v2.accelerer(rand.nextInt(31) + 10);
            v3.accelerer(rand.nextInt(31) + 10);

            //v1.afficher();
            //v2.afficher();
            //v3.afficher();
        }

        Voiture gagnant = v1;

        if (v2.vitesse > gagnant.vitesse) {
            gagnant = v2;
        }
        if (v3.vitesse > gagnant.vitesse) {
            gagnant = v3;
        }

        //gagnant.afficher();
    }
}

class Voiture {
    String marque;
    String modele;
    int vitesse;

    public Voiture(String marque, String modele, int vitesse) {
        this.marque = marque;
        this.modele = modele;
        this.vitesse = vitesse;
    }

    public void accelerer(int valeur) {
        this.vitesse += valeur;
    }

    public void ralentir(int valeur) {
        this.vitesse -= valeur;
        if (this.vitesse < 0) {
            this.vitesse = 0;
        }
    }

   
}