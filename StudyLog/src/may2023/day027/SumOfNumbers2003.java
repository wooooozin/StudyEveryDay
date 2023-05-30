package may2023.day027;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumbers2003 {
    public static int twoPointer(int[] arr, int target) {
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int cnt = 0;

        while (true) {
            if (sum > target) {
                sum -= arr[p1++];
            } else if (p2 == arr.length) {
                break;
            } else {
                sum += arr[p2++];
            }

            if (sum == target) {
                cnt += 1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(twoPointer(arr, M));
        System.out.println(Arrays.toString(arr));
    }
}
