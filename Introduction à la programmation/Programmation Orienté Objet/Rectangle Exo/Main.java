public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[] {
            new Rectangle(10, 15),
            new Rectangle(10, 15),
            new Rectangle(14, 25),
        };

        Rectangle rectangleGangant = rectangles[0];

        if (rectangles[1].getAir() > rectangles[0].getAir()) {
            rectangleGangant = rectangles[1];
        } else if (rectangles[2].getAir() > rectangles[0].getAir()) {
            rectangleGangant = rectangles[2];
        }

        System.out.println("Le gagnant est : ");
        rectangleGangant.afficherInfos();
        
    }
}
