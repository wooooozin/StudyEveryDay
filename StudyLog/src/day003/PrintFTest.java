package day003;

public class PrintFTest {
    public static void main(String[] args) {
        // 1. %d : 10진수 정수
        int num = 10;
        System.out.printf("%d입니다.\n", num);

        // 2. %f : 실수
        double fNum = 3.141592 * 100;
        System.out.printf("%4.2f 입니다.\n", fNum);

        // 3. %s : 문자열
        String str = "Hello";
        System.out.printf("%s 입니다.\n", str);

        // 4. %c : 문자를 출력합니다.
        char ch = 'A';
        System.out.printf("%c\n", ch); // 출력 결과: A

        // 5. %b : 논리값를 출력합니다.
        boolean bool = true;
        System.out.printf("%b\n", bool); // 출력 결과: true

        // 6. %n : 플랫폼 종속적인 줄 바꿈 문자를 출력합니다.
        System.out.printf("Hello,%nworld!\n");

        // 7. %o : 8진수 정수를 출력합니다.
        num = 10;
        System.out.printf("%o\n", num); // 출력 결과: 12

        // 8. %x : 16진수 정수를 출력합니다.
        num = 255;
        System.out.printf("%x\n", num); // 출력 결과: ff

        // 9. %X : 대문자 16진수 정수를 출력합니다.
        num = 255;
        System.out.printf("%X\n", num); // 출력 결과: FF
    }
}
