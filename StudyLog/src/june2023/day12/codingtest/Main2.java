package june2023.day12.codingtest;

import java.util.Arrays;

public class Main2 {
    public static int solution(int N, int[] arr) {
        Arrays.sort(arr); // 정렬 수행
        int answer = 0; // 인접한 두 문제 간의 난이도 차의 최댓값
        for (int i = 0; i < N - 2; i++) {
            int dif = Math.abs(arr[i] - arr[i + 2]); // 차이 계산
            answer = Math.max(answer, dif);
        }
        return answer;
    }


    public static void main(String[] args) {
        int N = 5;
        int[] arr = {1, 5, 3, 9, 2};
        System.out.println(solution(N, arr));
    }
}
