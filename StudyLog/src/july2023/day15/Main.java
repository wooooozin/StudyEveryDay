package july2023.day15;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int solution(String str1, String str2) {
        int answer = 0;
        HashMap<Character, Integer> str1Map = new HashMap<>();
        HashMap<Character, Integer> str2Map = new HashMap<>();
        int left = 0;
        int length = str2.length() - 1;

        for (Character ch : str2.toCharArray()) {
            str2Map.put(ch, str2Map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < length; i++) {
            str1Map.put(str1.charAt(i), str1Map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int right = length; right < str1.length(); right++) {
            str1Map.put(str1.charAt(right), str1Map.getOrDefault(str1.charAt(right), 0) + 1);
            if (str1Map.equals(str2Map)) {
                answer++;
            }
            str1Map.put(str1.charAt(left), str1Map.get(str1.charAt(left)) - 1);
            if (str1Map.get(str1.charAt(left)) == 0) {
                str1Map.remove(str1.charAt(left));
            }
            left++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }
}
