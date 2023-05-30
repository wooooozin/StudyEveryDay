package may2023.day023;

public class Programmers023 {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i <included.length; i++) {
            if (included[i]) {
                answer += (i * d) + a;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean[] booleanss = {true, false, false, true, true};
        System.out.println(solution(3, 4, booleanss));
    }
}
