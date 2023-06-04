package june2023.day05.classfield;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        // new - 객체를 생성하기 위한 키워드

        creditCard.setCardNumber(12345667788L);
        creditCard.cardOwner = "잔망루피";
        // . 필드 참조 연산자 (dot, 구두점) - 참조형 변수인 creditCard 에 . 을 사용하여 필드 cardNumber, cardOwner 를 참조, 접근
        System.out.println(creditCard.getCardNumber());
        System.out.println(creditCard.cardOwner);

        creditCard.use(10000);
        creditCard.payBill(10000);
        System.out.println(creditCard.balance);
        System.out.println(creditCard.point); // 10
    }
}
