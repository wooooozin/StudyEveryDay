package july2023.day16;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
