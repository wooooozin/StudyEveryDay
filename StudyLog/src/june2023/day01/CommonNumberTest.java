package june2023.day01;

import java.util.ArrayList;

public class CommonNumberTest {
    // 약수
    public ArrayList<Integer> getDivisor(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= (int) num / 2; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        result.add(num);
        return result;
    }

    // 최대 공약수
    public int getGCD(int a, int b) {
        int gcd = -1;
        ArrayList<Integer> divisorA = this.getDivisor(a);
        ArrayList<Integer> divisorB = this.getDivisor(b);

        for (int itemA : divisorA) {
            for (int itemB : divisorB) {
                if (itemA == itemB) {
                    if (itemA > gcd) {
                        gcd = itemA;
                    }
                }
            }
        }
        return gcd;
    }

    // 최대 공약수 (유클리드 호제법)
    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // 최소 공배수
    public int getLCM(int a, int b) {
        int lcm = -1;
        int gcd = this.getGCD(a, b);
        if (gcd != -1) {
            lcm = a * b / gcd;
        }

        return lcm;
    }

    public static void main(String[] args) {
        int numberA = 10;
        int numberB = 6;

        CommonNumberTest ct = new CommonNumberTest();
        ArrayList<Integer> listA = ct.getDivisor(numberA);
        ArrayList<Integer> listB = ct.getDivisor(numberB);
        // 약수
        System.out.println(listA); // [1, 2, 5, 10]
        System.out.println(listB); // // [1, 2, 3, 6]

        // 최대 공약수, 최소 공배수
        System.out.println(ct.findGCD(numberA, numberB)); // 2
        System.out.println(ct.getGCD(numberA, numberB)); // 2
        System.out.println(ct.getLCM(numberA, numberB)); // 30
    }
}
