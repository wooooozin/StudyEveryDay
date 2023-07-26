package july2023.day26;

import java.util.Scanner;

public class Main {

    private static int[] solution(int n, int m, int[] arr) {
        int[] answer = new int[n];
        for (int num : arr) {
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if (num == answer[i]) {
                    idx = i;
                }
            }
            if (idx == -1) {
                for (int i = n - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            } else {
                for (int i = idx; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            answer[0] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : solution(n, m, arr)) {
            System.out.print(num + " ");
        }
    }

}
