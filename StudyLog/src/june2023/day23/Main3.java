package june2023.day23;

import java.util.Scanner;

public class Main3 {

    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0}; // 왼쪽, 아래, 오른쪽, 위
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isFlag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n &&
                            arr[nx][ny] >= arr[i][j]) {
                        isFlag = false;
                        break;
                    }
                }
                if(isFlag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
