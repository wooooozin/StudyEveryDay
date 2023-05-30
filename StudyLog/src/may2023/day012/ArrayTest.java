package may2023.day012;

import java.util.ArrayList;
import java.util.Arrays;

// Array, ArrayList 복습
public class ArrayTest {
    public static void main(String[] args) {


        // 배열 선언
//        int[] numbers = new int[10];
        // 배열 초기화
//        배열을 선언하면 그와 동시에 각 요소의 값이 초기화 됨
        //
        int[] memberIDs = new int[] { 101, 102, 103}; // 배열 개수 생략
        int[] nums = {1, 2, 3}; // new int[] 생략 가능
        int[] ids; // 배열 자료형 선언 후
        ids = new int[] {1, 2, 3, 4, 5}; // 배열 할당, new int[] 생략 불가

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(numbers); // [I@2f92e0f4 [I - 배열 int, @다음부터 주소값
        // 반복문으로 직접 배열 원소 출력
        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Arrays.toString() 메서드 사용해 출력
        System.out.println(Arrays.toString(numbers)); // [100, 95, 80, 70, 60]

        // ArrayList
        // 생성자
        ArrayList<Integer> intArrayList = new ArrayList<>(); // 기본 크기가 10인 배열 생성
        System.out.println(intArrayList.size()); // 0
        ArrayList<String> stringArrayList = new ArrayList<>();

        // add, add(index, value)
        stringArrayList.add("Mike");
        stringArrayList.add(0, "James");
        System.out.println(stringArrayList); // [James, Mike]

        // get 해당 인덱스 값 반환
        String str = stringArrayList.get(0);
        String str1 = stringArrayList.get(1);
        System.out.println(str); // James
        System.out.println(str1); // Mike

        // set 인덱스로 값 변경
        stringArrayList.set(0, "Kiki");
        System.out.println(stringArrayList); // [Kiki, Mike]

        // indexOf 값을 제공하면 해당 값의 첫번째 인덱스를 반환
        stringArrayList.add("AA");
        stringArrayList.add("BB");
        stringArrayList.add("AA");
        System.out.println(stringArrayList); // [Kiki, Mike, AA, BB, AA]
        System.out.println(stringArrayList.indexOf("AA")); // 2

        // lastIndexOf 해당 값의 마지막 인덱스 반환
        System.out.println(stringArrayList.lastIndexOf("Kiki")); // 0
        System.out.println(stringArrayList.lastIndexOf("AA")); // 4

        // remove(index), remove(value) 해당 인덱스 삭제, 해당 데이터 중 첫번째 값 삭제
        stringArrayList.remove(0);
        System.out.println(stringArrayList); // [Mike, AA, BB, AA]
        stringArrayList.remove("AA");
        System.out.println(stringArrayList); // // [Mike, BB, AA]

        // contains(value) 값을 포함하는지 boolean으로 반환
        System.out.println(stringArrayList.contains("BB")); // true
        System.out.println(stringArrayList.contains("CC")); // false

        // clear() 모두 삭제, isEmpty 배열 비었는지 확인
        stringArrayList.clear();
        System.out.println(stringArrayList.isEmpty()); // true

        // size() 요소 개수 반환
        System.out.println(stringArrayList.size()); // 0

    }
}
