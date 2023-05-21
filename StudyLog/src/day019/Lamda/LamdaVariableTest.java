package day019.Lamda;

import java.util.function.*;
interface PrintString{
    void showString(String str);
}


public class LamdaVariableTest {
    public static void main(String[] args) {
        PrintString lambdaStr = s->System.out.println(s);  //람다식을 변수에 대입
        lambdaStr.showString("hello lambda_1"); // hello lambda_1
        showMyString(lambdaStr); // 매개변수로 전달 // hello lambda_2

        PrintString reStr = returnString();
        reStr.showString("hello "); // hello world
    }

    public static void showMyString(PrintString p) {
        p.showString("hello lambda_2");
    }
    public static PrintString returnString() {         //반환 값으로 사용
        return s->System.out.println(s + "world");
    }
}
