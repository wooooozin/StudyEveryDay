package june2023.day06.algorithm;

import java.util.Arrays;

public class ReversedArrayTest {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void reversedArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i -1);
        }
    }

    // 배열의 합 메서드
    static int sumOf(int[]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 새로운 배열에 모든 요소를 복사하는 메서드
    static void copyOf(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    // 새로운 배열에 arr 의 역순으로 복사하는 메서드
    static void reverseCopy(int[] a, int[] b) {
        for (int i = 0; i < a.length ; i++) {
            b[i] = a[a.length - 1 - i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 9, 6, 7};
//        reversedArray(arr);
//        System.out.println(Arrays.toString(arr));
        // [7, 6, 9, 3, 1, 5, 2]

        System.out.println(sumOf(arr)); // 33

        int[] b = new int[arr.length];
        copyOf(arr, b);
        System.out.println(Arrays.toString(b)); // [2, 5, 1, 3, 9, 6, 7]

        int[] c = new int[arr.length];
        reverseCopy(arr, c);
        System.out.println(Arrays.toString(c));
    }
}
