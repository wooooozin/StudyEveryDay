package day006;

import java.util.stream.IntStream;

public class PermutationTest {
    public static void main(String[] args) {
        // 팩토리얼 - 5 4 3 2 1 곱하기
        int n = 5;
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i;
        }
        System.out.println(result); // 120
        System.out.println(IntStream.range(2, 6).reduce(1, (x, y) -> x * y));

        // 순열 - 서로 다른 n개 중에서 r개를 선택하는 경우의 수 (순서 O, 중복 X) -> n! / (n-r)!
        n = 5;
        int r = 3;
        result = 1;
        for (int i = n; i >= n - r + 1; i--)  {
            result *= i;
        }
        System.out.println(result);

        // 중복 순열 - 서로 다른 n개 중에 r개를 선택하는 경우의 수(순서 O, 중복 O)
        n = 4;
        r = 2;
        result = 1;
        for (int i = 0; i < r; i++) {
            result *= n;
        }
        System.out.println(result);
        System.out.println((int) Math.pow(n, r));

        // 원 순열 - 원 모양의 테이블에 n개의 원소를 나열하는 경우의 수 / n!/n => (n-1)!;
//      원 모양의 테이블에 3명을 앉히는 경우의 수
        n = 3;
        result = 1;
        // 3!/3 => (3-1)! => 2 * 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        System.out.println(result); // 2

    }
}
