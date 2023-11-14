public class CardStrategy implements CardPayment{
    private String cardNum;
    private String date;
    private int cvv;

    public CardStrategy(String cardNum, String date, int cvv){
        this.cardNum = cardNum;
        this.date = date;
        this.cvv = cvv;
    }
    @Override
    public void processCard(double amount) {
        System.out.println("Paid $" + amount + " using credit card.");
    }
}
