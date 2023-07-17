package july2023.day17;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                while (stack.pop() != '(') {

                }
            } else {
                stack.push(ch);
            }
        }
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
