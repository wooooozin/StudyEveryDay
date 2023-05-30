package may2023.day027;

import java.util.Scanner;

public class TwoDimension2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int K = sc.nextInt(); // 구간의 개수

        // 구간의 합 계산하기
        for (int k = 0; k < K; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = 0;
            for (int row = i - 1; row < x; row++) {
                for (int col = j - 1; col < y; col++) {
                    sum += arr[row][col];
                }
            }
            System.out.println(sum);
        }
    }
}
