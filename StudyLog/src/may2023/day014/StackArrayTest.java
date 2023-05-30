package may2023.day014;

import java.util.Stack;

public class StackArrayTest {
    public static void main(String[] args) {

        Stack<String> strStack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();

        // 데이터 추가. front <- 1 <- 2 <- 3 (top)
        strStack.push("data1");
        strStack.push("data2");
        strStack.push("data3");

        // 최상단 값 출력 값을 삭제하지 않음, top
        String top = strStack.peek();
        System.out.println(top); // data3

        // 데이터 삭제, front <- 1 <- 2 <- 3--->>>>> pop
        System.out.println(strStack.pop()); // data3
        System.out.println(strStack.pop()); // data2
        strStack.clear(); //
        System.out.println(strStack); // []
//        strStack.pop(); // EmptyStackException

        // 데이터 추가
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        System.out.println(intStack); // [1, 2, 3, 4, 5]

        // 기타 메서드
        System.out.println(intStack.size()); // 5
        System.out.println(intStack.isEmpty()); // false
        System.out.println(intStack.contains(3)); // true
        System.out.println(intStack.search(3)); // 3,  뒤에서 몇번째 나오는지, 없으면 -1
        System.out.println(intStack.search(1)); // 5 중복된 값이 있으면 첫번째 만나는 자리 출력
        System.out.println(intStack.search(10)); // -1
    }
}
