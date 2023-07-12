package july2023.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {

    public static String solution(int n, String str) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : str.split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        for (String key : map.keySet()) {
            int cnt = map.get(key);
            if (cnt > max) {
                max = cnt;
                answer = key;
            }
        }

        return answer;
    }

    public static char solution2(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map.containsKey('A'));

        int max = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution2(n, str));
    }

}
