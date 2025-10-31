public class Rectangle {
    private int largeur;
    private int longueur;

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public int getAir() {
        return this.largeur * this.longueur;
    }

    public int getPerimetre() {
        return (this.largeur + this.longueur) * 2;
    }

    public void afficherInfos() {
        System.out.println("Largeur   : " + this.largeur);
        System.out.println("Longueur  : " + this.longueur);
        System.out.println("Air       : " + getAir());
        System.out.println("Périmètre : " + getPerimetre());
    }
}