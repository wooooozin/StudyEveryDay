package june2023.day15.codingtest;

public class SumOfString {

    public static int solution(String num_str) {
        int answer = 0;
        for (String s : num_str.split("")) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("123456789"	)); // 45
    }
}
