package august2023.day07;

public class Main {
    static void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        dfs(3);
    }
}
