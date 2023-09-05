package sept2023.day06;

import java.util.Scanner;

public class Main {
    static int answer = Integer.MIN_VALUE, c, n;
    static void dfs(int L, int sum, int[] arr) {
        if (sum > c ) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(L + 1, sum + arr[L], arr);
            dfs(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
