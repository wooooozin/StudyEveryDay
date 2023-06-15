package june2023.day15.datastructure;

import java.util.Scanner;

public class FactorialTest {
    public static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " 의 팩토리얼은 " + factorial(n) + "입니다.");
        // n = 5
        // 5 의 팩토리얼은 120입니다.
    }
}
