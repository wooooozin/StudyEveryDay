package may2023.day006;

import java.util.Scanner;
import java.util.Stack;

// 백준 25556번
// 스택 사용하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 순열 길이 N
        int[] intArr = new int[N]; // 순열 길이의 배열

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt(); // 배열에 데이터 넣기
        }

        Stack<Integer>[] stacks = new Stack[4]; // 순열을 담을 Stack
        for (int i = 0; i < stacks.length; i++) { // 스택 초기화
            stacks[i] = new Stack<>();
        }

        for (int i = 0; i < intArr.length; i++) { // int배열의 첫번째부터 4개의 스택에 넣을 떄 스택의 최상단 값보다 작으면 넣을 수 없다.
            int num = intArr[i];
            if (stacks[0].isEmpty() || stacks[0].peek() < num) {
                stacks[0].push(num);
            } else if (stacks[1].isEmpty() || stacks[1].peek() < num) {
                stacks[1].push(num);
            } else if (stacks[2].isEmpty() || stacks[2].peek() < num) {
                stacks[2].push(num);
            } else if (stacks[3].isEmpty() || stacks[3].peek() < num) {
                stacks[3].push(num);
            } else { // 4개의 스택 중 num이 스택의 최상단 값보다 작아 더 이상 넣을 수 없다면 NO 함수 종료
                System.out.println("NO");
                return;
            }
        }
        // 다 넣었으면 청소 가능 YES 출력
        System.out.println("YES");
    }
}
