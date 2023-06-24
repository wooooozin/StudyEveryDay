package june2023.day24;

import java.util.Scanner;

public class Main1 {
    
    public static int[] solution(int n, int[] scores) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (scores[i] < scores[j]) {
                        cnt++;
                    }
                }
                answer[i] = cnt;
            }
        }
        
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        int[] arr = solution(n, scores);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
