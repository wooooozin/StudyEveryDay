package may2023.day013;

import java.util.*;


public class bracketTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCnt = sc.nextInt();

        for (int i = 0; i < inputCnt; i++) {
            String inputStr = sc.next();
            Stack<String> stack = new Stack<>();
            boolean checkFlag = true;

            for (String str : inputStr.split("")) {
                if (str.equals("(")) {
                    stack.push(str);
                } else {
                    if (stack.isEmpty()) {
                        checkFlag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (checkFlag && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
