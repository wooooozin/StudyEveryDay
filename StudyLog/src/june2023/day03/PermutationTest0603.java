package june2023.day03;

// 1, 2, 3, 4, 를 이용해 세자리 자연수를 만드는 방법, 순서 있고 중복 안되고 결과 출력
public class PermutationTest0603 {
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }

    }

    static void swap(int[] arr, int depth, int idx) {
        int tmp = arr[depth];
        arr[depth] = arr[idx];
        arr[idx] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        permutation(arr, 0, 4, 3);
    }
}
