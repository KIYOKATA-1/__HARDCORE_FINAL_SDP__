public class MotoOrder {
    private double totalPrice;

    public void addMotorcycle(Motorcycle motorcycle) {
        this.totalPrice = motorcycle.getPrice();
    }

    public void addDecoration(MotoDecorator decoration) {
        this.totalPrice += decoration.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
