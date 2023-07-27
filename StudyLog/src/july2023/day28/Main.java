package july2023.day28;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != newArr[i]) {
                answer[idx++] = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : solution(n, arr)) {
            System.out.print(num + " ");
        }
    }
}
