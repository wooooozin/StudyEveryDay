package day022;

import java.util.Arrays;

public class GreedyTest {
    public static int solution(int[][] nums, int m) {
        int answer = 0;
        Arrays.sort(nums, (a, b) -> a[0] - b[0]); // 시작점에서 오름차순 정렬
        int i = 0;
        int start = 0;
        int end = 0;

        while (i < nums.length) {
            while (i < nums.length && nums[i][0] <= start) { // 시작점부터 가장 멀리가는 끝점을 구하는 것
                end = Math.max(end, nums[i][1]);
                i++;
            }
            answer++;
            if (end == m) {
                return answer;
            }
            start = end;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {{5, 10}, {1, 8}, {0, 2}, {0, 3}, {2, 5}, {2, 6}, {10, 12}, {7, 12}};
        int m = 12;
        System.out.println(solution(arr, m));
    }
}
