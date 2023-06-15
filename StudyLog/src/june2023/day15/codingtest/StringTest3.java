package june2023.day15.codingtest;

import java.util.Scanner;

public class StringTest3 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s + " ";
        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                sb.append(s.charAt(i));
                if (cnt > 1) {
                    sb.append(cnt);
                    cnt = 1;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solution(s));
    }
}
