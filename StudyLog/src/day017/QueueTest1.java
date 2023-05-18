package day017;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 데이터 삽입 - Enqueue
        queue.add(1);
        queue.add(2); // 사용 공간이 없어 삽입 실패시 Exception 발생
        queue.offer(3); // 공간이 없어 실패 시 flase 반환
        System.out.println(queue); // [1, 2, 3]

        // 데이터 삭제 - Dequeue
        System.out.println(queue.remove()); // 1 맨 앞 요소를 반환하고 삭제, 큐가 비어있다면 예외 발생
        System.out.println(queue.poll()); // 2 기능은 같지만 비어있을 시 null 반환

        // head 조회
        System.out.println(queue.peek()); // 3 , 비어있으면 null 반환
        System.out.println(queue.element()); // 3 , isEmpty() == 예외 발생

    }
}
