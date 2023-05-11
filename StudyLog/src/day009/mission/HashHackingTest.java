package day009.mission;

import java.util.Scanner;
// https://www.acmicpc.net/problem/26008
public class HashHackingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long h = sc.nextLong();
        long anwser = 1;

        for (int i = 0; i < n -1; i++) {
            anwser = (anwser * m) % 1000000007;
        }
        System.out.println(anwser);
    }
}
