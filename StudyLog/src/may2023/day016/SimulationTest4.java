package may2023.day016;

import java.util.Arrays;

public class SimulationTest4 {
    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(Arrays.toString(solution(park, routes)));
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[] directions = {'N', 'E', 'S', 'W'};
        int[] rows = {-1, 0, 1, 0};
        int[] columns = {0, 1, 0, -1};
        int row = 0;
        int col = 0;

        // S의 위치 구하기
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        // 커맨드에 맞게 이동하기
        for (String cmd : routes) {
            int newRow = row;
            int newCol = col;
            char direction = cmd.charAt(0);
            int move = Integer.parseInt(String.valueOf(cmd.charAt(2)));

            for (int i = 0; i < directions.length; i++) {
                if (direction == directions[i]) {
                    newRow = row;
                    newCol = col;
                    for (int j = 0; j < move; j++) {
                        newRow += rows[i];
                        newCol += columns[i];
                        if (newRow < 0 || newRow >= park.length
                                || newCol < 0 || newCol >= park[0].length()
                                || park[newCol].charAt(newRow) == 'X'
                        ) {
                            newRow -= rows[i];
                            newCol -= columns[i];
                            break;
                        }
                    }
                }
            }
            row = newRow;
            col = newCol;
        }
        answer[0] = row;
        answer[1] = col;
        return answer;
    }
}
