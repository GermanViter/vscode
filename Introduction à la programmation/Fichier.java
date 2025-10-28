import java.io.File;

public class Fichier {
    public static void main(String[] args) {
        File fich = new File("texte.txt");

        System.out.println(fich.getAbsolutePath());
    }
}
