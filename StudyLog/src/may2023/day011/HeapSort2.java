package may2023.day011;

import java.util.Scanner;

// 백준 - https://www.acmicpc.net/problem/24174
// 다시 힙 공부하고 풀기
public class HeapSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = n; i > 1; i--) {
            if (count >= k) {
                break;
            }

            int maxIndex = i;
            for (int j = i - 1; j >= Math.max(1, i - 2); j--) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }

            for (int j = maxIndex + 1; j <= i; j++) {
                swap(arr, j - 1, j);
                count++;
                if (count >= k) {
                    break;
                }
            }
        }

        if (count < k) {
            System.out.println("-1");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

