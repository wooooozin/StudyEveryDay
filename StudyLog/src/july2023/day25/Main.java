package july2023.day25;

import java.util.Scanner;

public class Main {
    private static int[] solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i], j;
            for (j = i-1; j >= 0 ; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
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

        for (int num : solution(arr)) {
            System.out.print(num + " ");
        }
    }
}
