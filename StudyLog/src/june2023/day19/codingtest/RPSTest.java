package june2023.day19.codingtest;

import java.util.Scanner;

public class RPSTest {
    public static String solution(int a, int b) {
        if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
            return "A";
        } else if (a == b) {
            return "D";
        } else {
            return "B";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(solution(arr1[i], arr2[i]));
        }
    }
}

