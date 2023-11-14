public class Thx implements OrderObserver{
    @Override
    public void orderCompleted() {
        System.out.println("Thank you for your order!");
    }
}
