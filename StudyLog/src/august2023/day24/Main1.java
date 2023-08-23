package august2023.day24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;

    static int[] check;
    static int[] distance;

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();

        check[v] = 1;
        distance[v] = 0;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int nextVertex : graph.get(currentVertex)) {
                if (check[nextVertex] == 0) {
                    check[nextVertex] = 1;
                    queue.offer(nextVertex);
                    distance[nextVertex] = distance[currentVertex] + 1;
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
        distance = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        bfs(1);
        for (int dis : distance) {
            System.out.println("- " + dis);
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}
