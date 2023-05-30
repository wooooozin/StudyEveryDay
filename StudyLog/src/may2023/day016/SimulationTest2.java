package may2023.day016;

import java.util.Arrays;

public class SimulationTest2 {

    public static int[] solution(String str, int n) {
        int x = 0;
        int y = 0;
        int nx = 0;
        int ny = 0;
        int[] xd = {-1, 0, 1, 0};
        int[] yd = {0, 1, 0, -1};
        char[] cmd = {'U', 'R', 'D', 'L'};

        for (char c : str.toCharArray()) {
            for (int i = 0; i < xd.length; i++) {
                if (c == cmd[i]) {
                    nx = x + xd[i];
                    ny = y + yd[i];
                }
            }
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue;
            }
            x = nx;
            y = ny;
        }
        return new int[] {x, y};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("RRRDDDUUUUUUL", 5)));
        System.out.println(Arrays.toString(solution("DDDRRRDDLL", 7)));
        System.out.println(Arrays.toString(solution("RRRRRDDDDDU", 5)));
        System.out.println(Arrays.toString(solution("RRRRDDDRRDDLLUU", 6)));
    }
}
