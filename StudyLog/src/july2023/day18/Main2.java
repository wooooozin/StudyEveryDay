package july2023.day18;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static int solution(String postfix) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char ch : postfix.toCharArray()) {
            if(Character.isDigit(ch)) {
                stack.push(ch - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (ch == '+') {
                    stack.push(lt + rt);
                } else if (ch == '-') {
                    stack.push(lt - rt);
                } else if (ch == '*') {
                    stack.push(lt * rt);
                } else if (ch == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        answer = stack.pop(); // get(0)
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postfix = sc.next();

        System.out.println(solution(postfix));
    }
}
