package day019.Lamda;

import java.util.ArrayList;
@FunctionalInterface
interface MyNumber {
    int getMax(int a, int b); // 추상메서드 선언
}

public class LamdaTest {
    public static void main(String[] args) {
        // 함수로 구현과 호출
        MyNumber funcMax = new MyNumber() {
            @Override
            public int getMax(int a, int b) {
                if (a >= b) {
                    return a;
                } else {
                    return b;
                }
            }
        };
        System.out.println(funcMax.getMax(10, 2)); // 10

        // 람다식 구현과 호출
        MyNumber lamdaMax = (a, b) -> (a >= b) ? a : b;
        System.out.println(lamdaMax.getMax(10,2)); // 10
    }
}
