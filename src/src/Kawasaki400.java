public class Kawasaki400 implements Motorcycle{
    private String brand = "Kawasaki";
    private String model = "Ninja 400";
    private String color;
    private int maxSpeed = 200;
    private double basePrice = 0;

    public Kawasaki400(String color) {
        this.color = color;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public String getDetails() {
        return getBrand() + getModel() + "Is no availible";
    }
}
