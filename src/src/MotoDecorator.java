import java.util.List;

public class MotoDecorator implements Motorcycle{
    private Motorcycle motorcycle;
    private String decoration;

    private int DecorPrice;

    public MotoDecorator(Motorcycle motorcycle, String decoration, int DecorPrice) {
        this.motorcycle = motorcycle;
        this.decoration = decoration;
        this.DecorPrice = DecorPrice;
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
    public double getPrice() {
        return motorcycle.getPrice() + DecorPrice;
    }

    @Override
    public String getDetails() {
        return "Brand: " + getBrand() + "\nModel: " + getModel() +
                "\nColor: " + getColor() + "\nMax Speed: " + getMaxSpeed() +
                "\nPrice: $" + getPrice();
    }

}
