package day018;

import java.util.Arrays;
import java.util.HashMap;

public class ProgrammersTest1 {
    public static String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                sb.append(key);
            }
        }
        System.out.println(map);
        String result = sb.toString();
        char[] answer = result.toCharArray();
        Arrays.sort(answer);
        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }
}
