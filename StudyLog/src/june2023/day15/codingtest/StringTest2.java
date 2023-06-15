package june2023.day15.codingtest;

import java.util.Map;
import java.util.Scanner;

public class StringTest2 {
    public static int[] solution(String s, char c) {
        int[] answer = new int[s.length()];
        int cnt = 10000;

        for (int i = 0; i < answer.length; i++) {
            if (s.charAt(i) == c) {
                cnt = 0;
                answer[i] = cnt;
            } else {
                cnt++;
                answer[i] = cnt;
            }
        }

        for (int i = answer.length - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                cnt = 0;
            } else {
                cnt++;
                answer[i] = Math.min(answer[i], cnt);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);

        for (int n : solution(s, c)) {
            System.out.print(n + " ");
        }

    }
}
