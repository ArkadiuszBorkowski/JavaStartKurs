package Super.VegeShop;

class Apple extends Fruit {
    public static final String TYPE = "jabłkowaty";
    private String variety;


    public Apple(double weight, String variety) {
        super(TYPE, weight);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", odmiana: " + variety;
    }
}
