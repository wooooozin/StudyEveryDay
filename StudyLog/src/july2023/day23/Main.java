package july2023.day23;

import java.util.Scanner;

public class Main {
    private static int[] solution(int n, int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int max = i;
            for (int j = i - 1; j >= 0 ; j--) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[max];
            arr[max] = tmp;
        }
        return arr;
    }

    private static int[] solution2(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : solution2(n, arr)) {
            System.out.print(num + " ");
        }

    }
}
