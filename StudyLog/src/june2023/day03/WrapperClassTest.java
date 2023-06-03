package june2023.day03;

public class WrapperClassTest {
    public static void main(String[] args) {
        Integer value = new Integer(100);
        int myValue = value.intValue();
        System.out.println(myValue);

        Integer num1 = Integer.valueOf("100");
        Integer num2 = Integer.valueOf(100);
        System.out.println(num1 + num2); // 200

        int num = Integer.parseInt("100");
        System.out.println(num); // 100

        Integer number = new Integer(50);
        int intNumber = 200;
        int sum = number + intNumber; // number.intValue()로 변환 : 언박싱
        System.out.println(sum); // 250

        Integer integerNumber = intNumber; // Integer.valueOf(intNumber) : 오토박싱
        System.out.println(integerNumber); // 200
    }
}
