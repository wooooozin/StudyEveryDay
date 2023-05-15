package day013;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethodTest {
    public static void main(String[] args) {
        // LinkedList 초기의 크기를 미리 생성할수는 없음
        LinkedList<Integer> list = new LinkedList<>();

        // add
        list.addFirst(1); // 가장 앞 head 데이터 추가
        list.addLast(2); // tail 데이터 추가
        list.add(1, 10); // 중간 데이터 추가
        list.add(20); // index 생략 시 마지막에 추가
        list.add(30); // index 생략 시 마지막에 추가
        System.out.println(list); // [1, 10, 2, 20, 30]

        // remove
        System.out.println(list.removeFirst()); // head 삭제 1
        System.out.println(list.removeLast()); // tail 삭제 30
        System.out.println(list.remove()); // 0번째 삭제 10
        System.out.println(list.remove(1)); // 중간 삭제  20
        System.out.println(list); // [2]

        // size
        System.out.println(list.size()); // 1

        // 출력

        LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3));

        System.out.println(list1.get(0));//0번째 index 출력

        for(Integer i : list1) { //향상된 for 문을 통한 전체출력
            System.out.println(i);
        }

        Iterator<Integer> iter = list1.iterator(); // Iterator 선언
        while(iter.hasNext()){ // 다음값이 있는지 체크
            System.out.println(iter.next()); //값 출력
        }
    }
}
