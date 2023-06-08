package june2023.day08.datastructure;

import java.awt.*;
import java.util.Scanner;

public class BinarySearchTest {
    static int search(int[] arr, int n, int key) {
        int left = 0;
        int right = n - 1;

        do {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1; // 찾는 값보다 중간 값이 크다면 검색 범위을 뒤쪽으로 보냄
            } else {
                right = mid - 1; // 찾는 값보다 중간 값이 작다면 검색 범위을 앞쪽으로 보냄
            }
        } while (left <= right);

        return - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        System.out.println("1번쨰 값을 입력하세요:");
        arr[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            do {
                System.out.println(i + 1 + "번쨰 값을 입력하세요:");
                arr[i] = sc.nextInt();
            } while (arr[i] < arr[i - 1]);
        }

        System.out.println("찾을 값 입력");
        int key = sc.nextInt();
        int idx = search(arr, n, key);

        if (idx == -1) {
            System.out.println("요소 없다.");
        } else  {
            System.out.println("찾는 값은 " + arr[idx] + " 입니다.");
        }
    }
}
