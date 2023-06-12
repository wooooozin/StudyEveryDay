package june2023.day12.codingtest;

import java.util.Scanner;

public class StringTest2 {
    public static String solution(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (Character.isAlphabetic(chars[left]) && Character.isAlphabetic(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            } else if (Character.isAlphabetic(chars[left]) && !Character.isAlphabetic(chars[right])) {
                right--;
            } else {
                left++;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }
}
