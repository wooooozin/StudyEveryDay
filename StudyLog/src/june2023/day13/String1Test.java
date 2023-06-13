package june2023.day13;

import java.util.Scanner;

public class String1Test {

    public static boolean solution(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean isTrue = solution(input);
        System.out.println(isTrue ? "YES" : "NO");
    }
}
