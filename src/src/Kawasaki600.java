public class Kawasaki600 implements Motorcycle{
    private String brand = "Kawasaki";
    private String model = "Ninja 300";
    private String color;
    private int maxSpeed = 200;
    private int basePrice = 1500;

    public Kawasaki600(String color) {
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
    public int getPrice() {
        return basePrice;
    }

    @Override
    public String getDetails() {
        return "Motorcycle: " + getBrand() + " " + getModel() + ", Color: " + getColor() + ", Max Speed: " + getMaxSpeed() + " km/h";
    }
}
