package june2023.day21.java;

import java.util.Scanner;

public class MainTest {
    public static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        sb.reverse();
        int newN = Integer.parseInt(sb.toString());
        if (isPrimeNumber(newN)) {
            System.out.print(newN + " ");
        }
        sb.setLength(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            solution(sc.nextInt());
        }
    }
}
