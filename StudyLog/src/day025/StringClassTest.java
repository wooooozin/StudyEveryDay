package day025;

public class StringClassTest {
    public static void main(String[] args) {
        String loopy1 = new String("loopyString"); // String 클래스의 생성자 매개변수로 생성
        String loopy2 = new String("loopyString"); // String 클래스의 생성자 매개변수로 생성
        String loopy3 = "loopy"; // 문자열 상수를 가리키는 방식으로 생성
        String loopy4 = "loopy"; // 문자열 상수를 가리키는 방식으로 생성

        System.out.println(loopy1 == loopy2); // false
        System.out.println(loopy1.equals(loopy2)); // true

        System.out.println(loopy3 == loopy4); // true
        System.out.println(loopy3.equals(loopy4)); // ture

        String java = new String("java");
        StringBuilder sb = new StringBuilder(java); // String으로 부터 StringBuilder생성
        String programming = new String("Programming");
        System.out.println(java); // java
        System.out.println(sb.toString()); // java
        System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(java));
        // 처음 문자열 주소 값 : 798154996

        sb.append(programming);
        java = sb.toString();
        System.out.println(java); // javaProgramming
        System.out.println("연결 후 주소 값: " + System.identityHashCode(java));


        // 연결 후 주소 값 : 1555009629
    }
}
