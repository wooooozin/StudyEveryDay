package may2023.day004.collection.arrayList;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data); // 큐의 맨 뒤에 추가
    }

    public String deQueue() {
        int length = arrayQueue.size();
        if (length == 0) {
            System.out.println("Queue is Empty");
            return null;
        }
        return (arrayQueue.remove(0)); // 0번째 인덱스 삭제, 맨앞 자료형 반환하고 배열에서 제거
    }

    @Override
    public String toString() {
        return arrayQueue.toString();
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue);

        System.out.println(queue.deQueue()); // A
        System.out.println(queue.deQueue()); // B
        System.out.println(queue.deQueue()); // C
        System.out.println(queue.deQueue()); // empty, null

        System.out.println(queue); // []
    }
}
