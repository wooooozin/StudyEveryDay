package day016;

import java.util.Arrays;

public class SimulationTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 3)));
    }

    public static int[] solution(int a, int b){
        int[] result = new int[2];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int k = 0; k < 4; k++){
            result[0] = a + dx[k];
            result[1] = b + dy[k];
        }

        return result;
    }
}
