package sept2023.day23;

import java.util.Scanner;

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;

    private static void dfs(int L, int sum, int[] arr) {
        if (sum > m) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dfs(0, 0, arr);
        System.out.println(answer);
    }

}
