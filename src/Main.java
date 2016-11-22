import java.util.Random;

public class Main {

    public static void main(String[] args) {
        IBomberBase[] bb = {
                new LandBomberBase(),
                new ShipBomberBase(),
                new LandBomberBase("light"),
                new ShipBomberBase("heavy"),
                new ShipBomberBase("light"),
                new LandBomberBase("heavy"),
        };

        Random r = new Random();

        for (IBomberBase b : bb) {
            int[] points = {r.nextInt(), r.nextInt()};
            b.bomb(points);
        }
    }

}
