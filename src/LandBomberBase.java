
class LandBomberBase extends BomberBase {

    LandBomberBase(String s) {
        super(s);
    }

    LandBomberBase() {
        this("medium");
    }

    @Override
    public void bomb(int[] points) {
        super.bomb(points);
        this.repairAircraft();
    }

    private void repairAircraft() {
        System.out.println("Aircraft repaired");
    }

}
