public class Thx implements OrderObserver{
    @Override
    public void orderCompleted() {
        System.out.println("CEO :> Thank you for your order!");
    }
}
