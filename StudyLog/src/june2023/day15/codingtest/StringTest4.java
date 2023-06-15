package june2023.day15.codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest4 {
    public static String solution(int n, String s) {
        String answer = "";
        int idx = 0;
        int divide = s.length() / n;
        s = s.replaceAll("#", "1");
        s = s.replaceAll("\\*", "0");
        String[] strings = s.split("");
        String[] newArr = new String[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = "";
            for (int j = 0; j < divide; j++) {
                newArr[i] += strings[idx++];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            answer += (char) Integer.parseInt(newArr[i], 2);
        }
        return answer;
    }

    public static String solution2(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String code = sc.next();

        System.out.println(solution2(cnt, code));
    }
}
