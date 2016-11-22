import java.util.Objects;

class BomberBase implements IBomberBase {

    private IBomberAircraft aircraft;

    BomberBase() {
        this("medium");
    }

    BomberBase(String aircraftType) {
        if (Objects.equals(aircraftType, "light"))
            this.aircraft = new LightBomberAircraft();
        else if (Objects.equals(aircraftType, "medium"))
            this.aircraft = new MediumBomberAircraft();
        else if (Objects.equals(aircraftType, "heavy"))
            this.aircraft = new HeavyBomberAircraft();
        else
            throw new IllegalArgumentException();
    }

    @Override
    public void bomb(int[] points) {
        this.aircraft.bomb(points[0], points[1]);
    }

}
