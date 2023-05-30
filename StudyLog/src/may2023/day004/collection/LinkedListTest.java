package may2023.day004.collection;

import java.util.LinkedList;

// 자료의 변동(수정, 삭제) 등이 많다면 링크드 리스트
//거의 없다면 배열을 사용하는게 좋다

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        // 요소 추가 add
        myList.add("A");
        myList.add("B");
        myList.add("C");
        System.out.println(myList);

        // 특정 위치에 데이터 추가
        myList.add(1, "D");
        System.out.println(myList);

        // 첫번째 요소 추가
        myList.addFirst("11");
        // 마지막 제거
        myList.removeLast();
        System.out.println(myList); // [11, A, D, B]
    }

}
