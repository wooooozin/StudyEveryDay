package august2023.day09;

public class Main {
    private static int dfs(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * dfs(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(dfs(5));
    }
}
