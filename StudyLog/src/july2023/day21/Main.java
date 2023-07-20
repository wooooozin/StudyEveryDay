package july2023.day21;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char ch : need.toCharArray()) {
            queue.offer(ch); // 필수과목 세팅
        }

        for (char ch : plan.toCharArray()) { // 플랜을 돌면서
            if (queue.contains(ch)) { // 큐에 플랜의 ch가 있는지 확인하고
                if (ch != queue.poll()) { // 큐.poll() 이 ch가 아니면 순서가 다르므로 리턴 false
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) { // 플랜의 순회가 끝나고 필수과목이 남아 있다면 필수 과목을 빼 먹은거라 false
            return "NO";
        }

        return answer; // 위 경우에 해당되지 않으면 true
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }

}
