package may2023.day016;

public class SimulationTest3 {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(solution(arr));
        int[][] arr1 = {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };
        System.out.println(solution(arr1));


    }

    public static int solution(int[][] board) {
        int answer = board.length * board.length;
        // 행, 열의 시계 방향에 따른 위치 변동 배열
        int[] rows = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] columns = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    answer--; // 1 하나 발견 변경
                    for (int k = 0; k < rows.length; k++) {
                        int row = i + rows[k];
                        int col = j + columns[k];
                        if (row >= 0 && row < board.length && col >= 0
                                && col < board[i].length && board[row][col] == 0) {
                            answer--;
                            board[row][col] = -1;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
