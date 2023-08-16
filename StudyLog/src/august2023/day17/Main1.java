package august2023.day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    static int[] distance = {1, -1, 5};
    static int[] check;

    static Queue<Integer> queue = new LinkedList<>();

    private static int bfs(int start, int end) {
        check = new int[10001]; // 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
        check[start] = 1; // 방문했다 라는 체크 변수로 1 아니면 초기값 0
        queue.offer(start);
        int L = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                int x = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nextX = x + distance[j];
                    if (nextX == end) {
                        return L + 1;
                    }
                    if (nextX >= 1 && nextX <= 10000 && check[nextX] == 0) {
                        check[nextX] = 1;
                        queue.offer(nextX);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(bfs(start, end));
    }
}
