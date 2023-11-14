public class MotoDecorator implements Motorcycle{
    private Motorcycle motorcycle;
    private String decoration;

    public MotoDecorator(Motorcycle motorcycle, String decoration) {
        this.motorcycle = motorcycle;
        this.decoration = decoration;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getModel(){
        return motorcycle.getBrand() + "with" + decoration;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public int getPrice() {
        return motorcycle.getPrice() + 1000;
    }

    @Override
    public String getDetails() {
        return null;
    }

}
