package july2023.day10;

import java.util.Scanner;

public class Main1 {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[left++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
