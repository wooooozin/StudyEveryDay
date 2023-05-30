package may2023.day016;

import java.util.Arrays;

public class SimulationTest1 {
    public static int[] solution(String moves) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        char[] dir = {'U', 'R', 'D', 'L'};
        int x = 0;
        int y = 0;

        for (char cmd : moves.toCharArray()) {
//            if (cmd == 'U') {
//                x = x + dx[0];
//                y = y + dy[0];
//            } else if (cmd == 'R') {
//                x = x + dx[1];
//                y = y + dy[1];
//            } else if (cmd == 'D') {
//                x = x + dx[2];
//                y = y + dy[2];
//            } else if (cmd == 'L') {
//                x = x + dx[3];
//                y = y + dy[3];
//            }
            // 리팩토링
            for (int k = 0; k < 4; k++) {
                if (cmd == dir[k]) {
                    x = x + dx[k];
                    y = y + dy[k];
                }
            }
        }
        return new int[] {x, y};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("DDDRRRDDLL")));
    }
}
