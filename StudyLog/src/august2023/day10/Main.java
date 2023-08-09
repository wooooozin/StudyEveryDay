package august2023.day10;

public class Main {
    static int[] arr;
    private static int dfs(int n) {
        if (n == 1) {
            return arr[n] = 1;
        } else if (n == 2) {
            return arr[n] = 1;
        } else {
            return arr[n] = dfs(n - 2) + dfs(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        arr = new int[n + 1];
        dfs(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
