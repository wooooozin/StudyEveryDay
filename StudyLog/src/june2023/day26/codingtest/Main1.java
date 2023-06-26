package june2023.day26.codingtest;

import java.util.Scanner;
import java.util.Arrays;

public class Main1 {
    public static int[] solution(int n, int[] arr, int m, int[] arr1) {
        int[] answer = new int[n + m];
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        while (p1 < n && p2 < m) {
            if (arr[p1] < arr1[p2]) {
                answer[i++] = arr[p1++];
            } else {
                answer[i++] = arr1[p2++];
            }
        }
        while (p1 < n) {
            answer[i++] = arr[p1++];
        }
        while (p2 < m) {
            answer[i++] = arr1[p2++];
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int num : solution(n, arr, m, arr1)) {
            System.out.print(num + " ");
        }
    }
}
