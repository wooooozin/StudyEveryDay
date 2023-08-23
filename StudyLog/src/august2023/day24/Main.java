package august2023.day24;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int answer;
    static int[] check;
    static ArrayList<ArrayList<Integer>> graph;

    private static void dfs(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int next : graph.get(v)) {
                if (check[next] == 0) {
                    check[next] = 1;
                    dfs(next);
                    check[next] = 0;
                }
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        dfs(1);
        System.out.println(answer);
    }
}
