package july2023.day10;

import java.util.Scanner;

public class Main2 {

    public static int solution(int n) {
        int answer = 0;
        int sum = 0;
        int left = 1;

        for (int right = 1; right < n; right++) {
            sum += right;
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= left++;
                if (sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;
        int sum = 0;
        int left = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int right = 0; right < m; right++) {
            sum += arr[right];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[left++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static int solution3(int n) {
        int answer = 0;
        int cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution3(n));
    }
}
