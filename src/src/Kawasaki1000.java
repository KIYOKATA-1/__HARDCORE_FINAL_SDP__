public class Kawasaki1000 implements Motorcycle{
    private String brand = "Kawasaki";
    private String model = "Ninja 1000";
    private String color;
    private int maxSpeed = 300;
    private double basePrice = 3000;

    public Kawasaki1000(String color) {
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
        return "Motorcycle: " + getBrand() + " " + getModel() + ", Color: " + getColor() + ", Max Speed: " + getMaxSpeed() + " km/h";
    }
}
