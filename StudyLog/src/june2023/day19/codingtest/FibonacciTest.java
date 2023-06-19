package june2023.day19.codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciTest {
    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        for (int i = 2; i < n; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void solutionElse(int n) {
        int a = 1;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] arr = solution(n);
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        solutionElse(n);

    }
}
