package may2023.day017;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int length = arrayQueue.size();
        if (length == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        return arrayQueue.remove(0);
    }

    public String peek() {
        int length = arrayQueue.size();
        if (length == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        return arrayQueue.get(0);
    }

    @Override
    public String toString() {
        return "MyQ{" +
                "arrayQueue=" + arrayQueue +
                '}';
    }
}
public class QueueArrayListTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        System.out.println(queue.peek()); // A
        System.out.println(queue); //MyQ{arrayQueue=[A, B, C]}

        System.out.println(queue.deQueue()); // A
        System.out.println(queue.deQueue()); // B
        System.out.println(queue.deQueue()); // C
        System.out.println(queue.deQueue()); // empty, null

        System.out.println(queue); // []
    }
}
