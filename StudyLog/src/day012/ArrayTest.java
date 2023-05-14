package day012;

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
    }
}
