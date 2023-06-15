package june2023.day15.codingtest;

import java.util.Scanner;

public class StringTest1 {
    public static int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(str);
        return answer;
    }

    public static int solution2(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;
    }

    public static int solution3(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution3(input));
    }
}
