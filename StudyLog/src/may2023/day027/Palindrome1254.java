package may2023.day027;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Palindrome1254 {
    public static boolean checkPalindrome(String s) {
        Deque<String> deque = new ArrayDeque();
        boolean isPalindrome = true;

        for (String str : s.split("")) {
            deque.addFirst(str);
        }

        while (!deque.isEmpty()) {
            String s1 = deque.pollFirst();
            String s2 = deque.pollLast();

            if (s1 != null && s2 != null && !s1.equals(s2)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int length = input.length();

        for (int i = 0; i < input.length(); i++) {
            if (checkPalindrome(input.substring(i))) {
                System.out.println(input.substring(i));
                break;
            }
            length++;
            sb.append(input.charAt(i));
        }
        System.out.println(length);
        System.out.println(sb.toString());
    }
}
