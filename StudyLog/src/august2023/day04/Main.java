package august2023.day04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int count(int[] arr, int distance) {
        int cnt = 1;
        int end = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - end >= distance) {
                cnt++;
                end = arr[i];
            }
        }
        return cnt;
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[arr.length - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
