package day010.mission;

import java.util.LinkedList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1158
public class JosephusTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        // 데이터 n개 만큼 추가하기
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int idx = 0;
        sb.append("<");
        while (!list.isEmpty()) {
            idx += k - 1; // k - 1 만큼 인덱스 이동
            int size = list.size(); // 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1

            while (idx > size - 1) {
                idx = idx - size;
                System.out.println(idx);
            }

            if (list.size() == 1) { // 데이터가 삭제되면 길이도 삭제된 만큼 감소
                sb.append(list.remove(idx) + "");
            } else {
                sb.append(list.remove(idx) + ", ");
            }

            if (list.isEmpty()) {
                sb.append(">");
            }
        }
        System.out.println(sb.toString());

    }
}
