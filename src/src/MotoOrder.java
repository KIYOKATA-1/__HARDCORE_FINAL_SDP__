import java.util.ArrayList;
import java.util.List;

public class MotoOrder {
    private List<Motorcycle> motorcycles;
    private List<MotoDecorator> decorations;
    private List<OrderObserver> observers;
    private double totalPrice;

    public MotoOrder() {
        motorcycles = new ArrayList<>();
        decorations = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addMotorcycle(Motorcycle motorcycle) {
        this.totalPrice = motorcycle.getPrice();
    }

    public void addDecoration(MotoDecorator decoration) {
        this.totalPrice = decoration.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.orderCompleted();
        }
    }
}
