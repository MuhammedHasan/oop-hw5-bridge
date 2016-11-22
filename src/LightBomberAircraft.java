
class LightBomberAircraft implements IBomberAircraft {

    @Override
    public void bomb(int x1, int y1) {
        System.out.println("Bombing:");
        System.out.println("x:" + x1 + " y:" + y1);
    }

}
