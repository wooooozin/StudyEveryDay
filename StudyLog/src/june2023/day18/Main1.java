package june2023.day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static int solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(arr[i-1], max);
            if (max < arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer.size() + 1;
    }

    public static int solution2(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
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

        System.out.println(solution2(n, arr));
    }
}
