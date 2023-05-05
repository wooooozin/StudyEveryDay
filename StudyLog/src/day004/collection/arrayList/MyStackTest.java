package day004.collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() { // 스택의 맨 뒤의 요소 꺼냄
        int length = arrayStack.size();
        if (length == 0) {
            System.out.println("Stack is Empty");
            return null;
        }
        return arrayStack.remove(length - 1); // 마지막 인덱스 자료 반환하고 배열에서 제거
    }

    @Override
    public String toString() {
        return arrayStack.toString();
    }
}

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack); //

        System.out.println(stack.pop()); // C
        System.out.println(stack.pop()); // B
        System.out.println(stack.pop()); // A
        System.out.println(stack.pop()); // Stack is Empty, null

        System.out.println(stack); // []
    }
}
