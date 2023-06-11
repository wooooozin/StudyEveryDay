package june2023.day11.codingtest;

import java.util.Scanner;

public class StringCodingTest3 {
    public static String solution(String str) {
        String answer = "";

        for (String s : str.split(" ")) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }
}
