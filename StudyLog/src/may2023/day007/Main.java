package may2023.day007;

// 백준 1021번
// 회전하는 큐

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList; // Queue 사용시에는 LinkedList 사용 및 import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 첫째줄 큐의 크기 N
        int M = sc.nextInt(); // 첫째줄 뽑아내려는 수 M
        int count = 0; // 2, 3번 case일 때 추가 횟수

        Deque<Integer> queue = new LinkedList<>(); // 큐
        int[] location = new int [M];

        // 큐에 데이터 넣기
        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        // 뽑아내려는 위치 배열 넣기
        for (int i = 0; i < M; i++) {
            location[i] = sc.nextInt();
        }

        // 뽑아내는 위치 확인
        for (int i = 0; i < location.length; i++) {
            while (true) {
                int index = 0; // 몇번쨰 인덱스인지 찾기
                Iterator ir = queue.iterator();
                while (ir.hasNext()) {
                    if (ir.next().equals(location[i])) {
                        break;
                    }
                    index++;
                }

                if (index == 0) {
                    queue.pollFirst();
                    break;
                } else if (index > queue.size() / 2) {
                    queue.addFirst(queue.removeLast());
                    count++;
                } else {
                    queue.addLast(queue.removeFirst());
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
