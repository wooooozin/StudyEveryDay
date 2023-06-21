package june2023.day21.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solution1(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            if (isPrime(res)) {
                list.add(res);
            }
        }
        return list;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i = 0; i < n; i++) {
//            solution(sc.nextInt());
//        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution1(n, arr)) {
            System.out.print(x +  " ");
        }
    }
}
