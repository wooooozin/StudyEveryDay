package may2023.day013;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strArr.length; i++) {
            s = s.replace(strArr[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution st = new Solution();
        System.out.println(st.solution("one4seveneight"));
        System.out.println(st.solution("23four5six7"));
        System.out.println(st.solution("2three45sixseven"));
        System.out.println(st.solution("123"));
    }
}
