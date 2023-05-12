package day010.mission;

import java.util.*;

// 프로그래머스 - https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class ProcessTest {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // 큐(Queue)와 우선순위 큐(PriorityQueue)에 값 저장
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
            priorityQueue.add(-priorities[i]);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int maxPriority = -priorityQueue.peek();

            if (priorities[current] == maxPriority) {
                answer++;
                priorityQueue.poll();

                if (current == location) {
                    break;
                }
            } else {
                queue.add(current);
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2}; // 3 4 1 2
        int location = 2; // 1
        System.out.println(solution(arr, location));

        int[] arr1 = {1, 1, 9, 1, 1, 1}; // 5 6 1 2 3 4
        int location1 = 0; // 5
        System.out.println(solution(arr1, location1));
    }
}
