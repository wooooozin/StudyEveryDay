package june2023.day05.classfield;

public class CreditCard {
    // 필드
    private long cardNumber;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String cardOwner;

    public long balance = 0;
    public long point = 0;

    // 메서드
    public void use(long amount) {
        balance += amount;
    }

    public void payBill(long amount) {
        balance -= amount;
        addPoint(amount / 1000);
    }

    private void addPoint(long amount) {
        point += amount;
    }




}
