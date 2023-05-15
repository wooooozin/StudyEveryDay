package day013;


import java.util.*;

class Solution {
    public int[] solution(int n) {
        int idx = (n % 2 == 0) ? (n / 2) : (( n / 2) + 1);
        int[] answer = new int[idx];
        int answerIndex = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            answer[answerIndex++] = i;
        }
        return answer;
    }
}

public class HateEvenNumber {

    public static void main(String[] args) {
        Solution st = new Solution();
        System.out.println(Arrays.toString(st.solution(10))); // [1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(st.solution(15))); // [1, 3, 5, 7, 9, 11, 13, 15]
    }
}
