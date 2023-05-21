package day019.Lamda;

@FunctionalInterface
interface StringConcat {
    public void makeString(String s1, String s2);
}

public class StringJoinTest {
    public static void main(String[] args) {
        // 람다식 구현
        String s1 = "Hello";
        String s2 = "Loopy!";
        StringConcat concat = (str1, str2) -> System.out.println(str1 + ", " + str2);
        concat.makeString(s1, s2); // Hello, Loopy!
    }
}
