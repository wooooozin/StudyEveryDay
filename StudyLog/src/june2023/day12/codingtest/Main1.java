package june2023.day12.codingtest;


public class Main1 {
    public static int calculate(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            if (digit == 3 || digit == 7) {
                result += 1;
            }
            x = x / 10;
        }
        return result;
    }

    public static int solution(int N) {
        int answer = 0;
        // 1부터 N까지의 자연수를 하나씩 확인하며
        for (int x = 1; x <= N; x++) {
            answer += calculate(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(34));
        System.out.println(solution(100));
    }
}
