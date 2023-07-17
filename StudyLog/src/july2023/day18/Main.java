package july2023.day18;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int position : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][position - 1] != 0) {
                    int tmp = board[i][position - 1];
                    board[i][position - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int[] moves = new int[k];
        for (int i = 0; i < k; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(solution(board, moves));
    }

}
