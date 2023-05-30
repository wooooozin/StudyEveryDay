package may2023.day026;

public class RecursiveFuncTest {
    public static void recursive(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Call recursive(" + n + ")");
        recursive(n - 1);
        System.out.println("After recursive(" + n + ")");
        System.out.println(n);
    }

    public static void main(String[] args) {
        recursive(5);
    }
}
