package june2023.day03;

public class Permutation0603 {
    public static void main(String[] args) {
        // 팩토리얼
//        int n = 5;
//        int result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        System.out.println(factorial(n));
//        System.out.println(result); // 120


        // 순열 - 5명을 3명으로 세우는 경우의 수
        int n = 5;
        int r = 3;
        int result = 1;

        for (int i = n; i >= n - r + 1; i--) {
            result *= i;
        }

        System.out.println(result); // 60

        // 중복 순열 - 서로 다른 4개의 수 중 2개를 뽑는 경우의 수 (중복 허용)
        n = 4;
        r = 2;
        result = 1;

        for (int i = 0; i < r; i++) {
            result *= n;
        }
        System.out.println(result); // 16

        System.out.println((int) Math.pow(n, r)); // 16

        // 원순열 - 원 모양의 테이블에 3명을 앉히는 경우의 수
        n = 3;
        result = 1;

        for (int i = 1; i < n; i++) {
            result *= i;
        }
        System.out.println(result); // 2
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


}
