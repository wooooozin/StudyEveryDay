package june2023.day23;

import java.util.Scanner;

public class Main1 {
    public static int solution(int[] arr) {
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
}
