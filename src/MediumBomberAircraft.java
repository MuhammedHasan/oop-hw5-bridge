class MediumBomberAircraft implements IBomberAircraft {

    @Override
    public void bomb(int x, int y) {
        System.out.println("Bombing:");
        System.out.println("x:" + x + " y:" + y);
        System.out.println("x:" + x + 1 + " y:" + y + 1);
    }

}
