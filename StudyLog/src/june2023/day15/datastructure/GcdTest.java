package june2023.day15.datastructure;

import java.util.Scanner;

public class GcdTest {
    // 재귀 함수 안쓰고 구현
    private static int solution(int x, int y) {
        while (y != 0) {
            int z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

    // 재귀함수로 구현
    private static int solution1(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return solution1(y, x % y);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(solution(x, y));
        System.out.println(solution1(x, y));
    }
}
