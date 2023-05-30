package day028;

import java.util.Scanner;

public class ACMICPC1890 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 지도 만들기
        int map[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= n ; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        long dp[][] = new long[n + 1][n + 1];
        dp[1][1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int next = map[i][j];
                if (next == 0) {
                    break;
                }

                if (j + next <= n) {
                    dp[i][j + next] += dp[i][j];
                }
                if (i + next <= n) {
                    dp[i + next][j] += dp[i][j];
                }
            }
        }
        System.out.println(dp[n][n]);
    }
}
