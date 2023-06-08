package june2023.day08.datastructure;

import java.util.Arrays;

public class ArrayBinarySearchTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 9;

        int idx = Arrays.binarySearch(arr, key);
        System.out.println(idx); // 8
        System.out.println(arr[idx]); // 9

        key = 33;
        idx = Arrays.binarySearch(arr, key);
        System.out.println(idx); // -11 ( -length - 1)

        int arr1[] = {1, 2, 3, 4, 5};
        idx = Arrays.binarySearch(arr1, 6);
        System.out.println(idx); // -6 (-length - 1)

    }
}
