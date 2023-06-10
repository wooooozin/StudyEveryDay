package june2023.day11.java;

class MyClass {

}

public class ClassClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class.forName("클래스 이름") 메서드 사용하기
        Class c = Class.forName("java.lang.String");
        System.out.println("c의 클래스: " + c.getName()); // c의 클래스: java.lang.String

        // Object 클래스의 getClass() 메서드 사용하기
        MyClass m1 = new MyClass();
        Class c1 = m1.getClass();
        System.out.println("c1의 클래스: " + c1.getName()); // c1의 클래스: packageInfo +.java.MyClass

        // 클래스 파일 이름을 Class 변수에 직접 대입하기
        Class c2 = MyClass.class;
        System.out.println("c2의 클래스: " + c2.getName()); // c1의 클래스: packageInfo +.java.MyClass
    }
}
