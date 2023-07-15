package july2023.day15;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main1 {
    public static int solution(int n, int m, int[] arr) {
        int answer = -1;
        // 세수의 합을 set 내림차순 정렬
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    set.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int cnt = 0;
        for (int num : set) {
            cnt++;
            if (cnt == m) {
                return num;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
