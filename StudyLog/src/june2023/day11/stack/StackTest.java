package june2023.day11.stack;

import java.util.Scanner;

class IntStack {
    private int[] stack;
    private int capacity;
    private int pointer;

    class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    public IntStack(int maxLength) {
        pointer = 0;
        capacity = maxLength;
        try {
            stack = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(int data) throws OverflowIntStackException {
        if (pointer >= capacity) {
            throw new OverflowIntStackException();
        }
        return stack[pointer++] = data;
    }

    public int pop() throws EmptyIntStackException {
        if (pointer <= 0) {
            throw new EmptyIntStackException();
        }
        return stack[--pointer];
    }

    public int peek() throws EmptyIntStackException {
        if (pointer <= 0) {
            throw new EmptyIntStackException();
        }
        return stack[pointer - 1];
    }

    public void clear() {
        pointer = 0;
    }

    public int indexOf(int data) {
        for (int i = pointer - 1; i >= 0; i--) {
            if (stack[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= capacity;
    }

    public void dump() {
        if (isEmpty()) {
            System.out.println("stack is Empty");
        } else {
            for (int i = 0; i < pointer; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackTest {
    public static void main(String[] args) {
        // 크기가 5인 스택 만들기
        IntStack stack = new IntStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.dump(); // 1 2 3 4 5

        System.out.println(stack.pop()); // 5
        stack.dump(); // 1 2 3 4
        System.out.println(stack.peek()); // 4
        System.out.println(stack.isEmpty()); // false;
        stack.clear();
        stack.dump(); // stack is Empty
    }
}
