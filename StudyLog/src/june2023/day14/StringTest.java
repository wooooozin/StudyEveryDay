package june2023.day14;

import java.util.Scanner;

public class StringTest {
    public static String solution(String str) {
        String newStr = str.replaceAll("[^a-zA-Z]", "");
        String[] strings = newStr.split("");
        int left = 0;
        int right = newStr.length() - 1;
        while (left < right) {
            if (!strings[left].equalsIgnoreCase(strings[right])) {
                return "NO";
            }
            left++;
            right--;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
