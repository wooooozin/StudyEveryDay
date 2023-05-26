package day024;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers0241 {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[][] rankIndex = new int[rank.length][2];

        for (int i = 0; i < rank.length; i++) {
            rankIndex[i][0] = rank[i];
            rankIndex[i][1] = i;
        }
        Arrays.sort(rankIndex, (a, b) -> a[0] - b[0]);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[rankIndex[i][1]]) {
                result.add(rankIndex[i][1]);
            }
            if (result.size() == 3) {
                break;
            }
        }
        int first = result.get(0) * 10000;
        int second = result.get(1) * 100;
        int third = result.get(2);
        answer = first + second + third;
        return answer;
    }

    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};

        System.out.println(solution(rank, attendance)); // 20403
    }
}
