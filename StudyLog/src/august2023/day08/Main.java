package august2023.day08;

public class Main {
    private static void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs( n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        dfs(11);
    }
}
