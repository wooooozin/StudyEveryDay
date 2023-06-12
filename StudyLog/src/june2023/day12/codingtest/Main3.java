package june2023.day12.codingtest;

import java.util.*;

class Node {
    public int x;
    public int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main3 {

    public static int[] dx = { -1, 1, 0, 0 };
    public static int[] dy = { 0, 0, -1, 1 };

    public static int[][] bfs(int N, String[][] temp, int x, int y) {
        int[][] graph = new int[N][N]; // 최단 거리 맵
        for (int i = 0; i < N; i++)
            Arrays.fill(graph[i], -1);
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        graph[x][y] = 0;
        while (!q.isEmpty()) { // BFS 수행
            Node cur = q.poll();
            x = cur.x;
            y = cur.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 공간을 벗어난 경우 무시
                if (nx < 0 || ny < 0 || nx >= N || ny >= N)
                    continue;
                // 벽인 경우 무시
                if (temp[nx][ny].equals("X"))
                    continue;
                // 처음 방문하는 경우
                if (graph[nx][ny] == -1) {
                    // 최단 거리 기록
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }

            }
        }
        return graph;
    }

    // 전체 보드의 크기(N)와 각 보드 정보 배열(board)을 입력받기
    public static int solution(int N, String[][] board) {
        int answer = (int) 1e9;
        String[][] temp = new String[N][N]; // 2차원 배열 생성
        for (int i = 0; i < N; i++)
            Arrays.fill(temp[i], "B");
        int startX = 0;
        int startY = 0;
        // 기술 ②: 두 번째로 먼 타켓 찾기
        ArrayList<Node> targets = new ArrayList<Node>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[i][j] = board[i][j];
                if (board[i][j].equals("P")) {
                    startX = i;
                    startY = j;
                } else if (board[i][j].equals("O")) {
                    targets.add(new Node(i, j));
                }
            }
        }
        int[][] graph = bfs(N, temp, startX, startY);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Node node : targets) {
            // 도달 가능한 타겟 지점들의 최단 거리 확인
            int i = node.x;
            int j = node.y;
            if (graph[i][j] != -1)
                result.add(graph[i][j]);
        }
        // 도달 가능한 타겟 지점들에 대한 최단 거리 순으로 정렬
        Collections.sort(result);
        if (result.size() >= 2) { // 도달 가능한 타겟 지점이 두 개 이상이라면
            // 두 번째로 먼 타켓까지의 최단 거리
            answer = result.get(result.size() - 2);
        }
        if (result.size() == 1) { // 도달 가능한 타겟 지점이 하나라면
            answer = result.get(0);
        }
        // 기술 ①: 각 벽을 지워보며, BFS 수행하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j].equals("X")) {
                    for (int x = 0; x < N; x++) {
                        for (int y = 0; y < N; y++) {
                            temp[x][y] = board[x][y];
                        }
                    }
                    temp[i][j] = "B"; // 벽을 빈 공간으로 변경
                    graph = bfs(N, temp, startX, startY);
                    int maxDist = -1; // 가장 먼 타겟 지점까지의 최단 거리
                    for (Node node : targets) {
                        int x = node.x;
                        int y = node.y;
                        // 도달 가능한 타겟 지점들의 최단 거리 확인
                        if (graph[x][y] != -1) {
                            maxDist = Math.max(maxDist, graph[x][y]);
                        }
                    }
                    // 도달 가능한 곳이 없다면 무시
                    if (maxDist == -1)
                        continue;
                    answer = Math.min(answer, maxDist);
                }
            }
        }
        if (answer == (int) 1e9)
            answer = -1;
        return answer;
    }



    public static void main(String[] args) {
        int N = 6;
        String[][] board = {
                {"B", "O", "B", "B", "B", "B"},
                {"X", "X", "X", "X", "X", "B"},
                {"B", "B", "O", "B", "P", "B"},
                {"X", "X", "B", "X", "B", "B"},
                {"B", "B", "O", "X", "B", "B"},
                {"B", "B", "B", "B", "B", "B"}};
        System.out.println(solution(N, board));
    }
}
