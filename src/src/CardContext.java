public class CardContext {
    private CardPayment cardPayment;

    public void setCardPayment(CardPayment cardPayment){
        this.cardPayment = cardPayment;
    }
    public void processCard(double amount){
        if(cardPayment != null){
            cardPayment.processCard(amount);
        }
    }
}
