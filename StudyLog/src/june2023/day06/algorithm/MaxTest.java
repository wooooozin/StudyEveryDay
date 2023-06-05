package june2023.day06.algorithm;

import java.util.Scanner;

public class MaxTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = max3(a, b, c);

        System.out.println("MAX는 : " + max + "입니다.");
    }
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
