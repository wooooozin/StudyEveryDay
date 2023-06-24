package june2023.day23;

import java.util.Scanner;

public class Main2 {

    public static int solution(int[][] arr) {
        int answer = 0;
        int rowSum = 0;
        int colmSum = 0;
        int crossSum1 = 0;
        int crossSum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                rowSum += arr[i][j];
                colmSum += arr[j][i];
            }
            answer = Math.max(answer, Math.max(rowSum, colmSum));
            rowSum = 0;
            colmSum = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            crossSum1 += arr[i][i];
            crossSum2 += arr[i][arr.length - 1 - i];
        }
        answer = Math.max(answer, Math.max(crossSum1, crossSum2));
        return answer;
    }

    public static int solution2(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for(int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, Math.max(sum1, sum2));
        }
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - 1 - i];
        }
        answer = Math.max(answer, Math.max(sum1, sum2));
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr));
    }
}
