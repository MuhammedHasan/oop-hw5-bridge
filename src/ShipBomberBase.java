
class ShipBomberBase extends BomberBase {

    ShipBomberBase(String s) {
        super(s);
    }

    ShipBomberBase() {
        this("medium");
    }

    @Override
    public void bomb(int[] points) {
        super.bomb(points);
        this.loadAircraft();
    }

    private void loadAircraft() {
        System.out.println("Bombs loaded to aircraft.");
    }

}
