package june2023.day03;

import java.util.Arrays;

// 순서 있고 중복 없이 1, 2, 3, 4 출력
public class PermutationTest060301 {
    static int cnt = 0;
    static void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {
        if (depth == r) {
            cnt++;
            System.out.println(Arrays.toString(out) + "No : " +cnt );
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth + 1, n, r, visited, out);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int r = 3;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];
        int[] out = new int[r];

        permutation(arr, 0, n, r, visited, out);
    }
}
