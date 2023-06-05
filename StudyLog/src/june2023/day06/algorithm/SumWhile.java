package june2023.day06.algorithm;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println(sum);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumOf(a, b));
    }

    // 가우스 덧셈
    static int sumOf(int a, int b) {
        int sum = (a + b) * (b / 2);
        return sum;
    }
}
