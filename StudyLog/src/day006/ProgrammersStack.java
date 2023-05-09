package day006;

import java.util.Arrays;
import java.util.Stack;

public class ProgrammersStack {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));

        arr = new int[] {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr)));

    }

    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        int prev = -1; // 나올 수 없는 값으로 설정해놓고
        for (int num : arr) {
            if (num != prev) { // arr배열의 값이 prev 다를때
                stack.push(num); // 스택에 넣기
                prev = num; // 이전값 num으로 대입
            }
        }

        int[] answer = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            answer[index--] = stack.pop(); // 스택 위에서 꺼낸 값을 배열의 끝부터 채워준다
        }
        return answer;
    }
}
