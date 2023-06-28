package june2023.day29;

import java.util.Scanner;

public class Main1 {
    public static int solution(int n, int day, int[] sales) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < day; i++) {
            answer += sales[i];
        }
        sum = answer;
        for (int i = day; i < n; i++) {
            sum = sum + sales[i] - sales[i - day];
            answer = Math.max(sum, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int day = sc.nextInt();
        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        System.out.println(solution(n, day, sales));


    }
}
