package day024;

public class Programmers0242 {
    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        int end = section[0] + m - 1;

        for (int i = 0; i < section.length; i++) {
            if (end < section[i]) {
                answer++;
                end = section[i] + m - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] section = {2, 3, 6};
        int n = 8;
        int m = 4;

        System.out.println(solution(n, m, section));
    }
}
