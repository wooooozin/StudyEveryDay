package june2023.day01;

import java.util.Scanner;

public class PermutationTest {
    static int n, m;
    static int[] pm;
    static int[] check;
    public static void dfs(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[L] = i;
                    dfs(L+1);
                    check[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        check = new int[n + 1];
        dfs(0);
        // 중복순열 - 상태트리 그려요
    }
}
