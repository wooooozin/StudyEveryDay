package june2023.day08.datastructure;

import java.util.Scanner;

public class SeqSearchTest {
    static int searchKey(int[] arr, int n, int key) {
        int i = 0;
        arr[n] = key;

        while (true) {
            if (arr[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 입력하세요.");
        int num = sc.nextInt();
        int[] arr = new int[num + 1];
        System.out.println(arr.length);

        System.out.println("배열의 갯수" + num + "만큼 입력하세요.");
        for (int i = 0; i < num; i++) {
            System.out.println(i + 1 + "번째");
            arr[i] = sc.nextInt();
        }

        // find Value
        System.out.println("찾을 값 입력하세요.");
        int key = sc.nextInt();
        int idx = Solution.seqSearch(arr, num, key);
        if (idx == -1) {
            System.out.println("일치하는 값이 없습니다.");
        } else {
            System.out.println("일치하는 값은 " + arr[idx] + " 입니다.");
        }
    }
}
