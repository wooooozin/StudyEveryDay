package june2023.day02;

import java.util.SplittableRandom;

public class Programmer0602 {
    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        System.out.println(solution(arr, parts));
    }
}
