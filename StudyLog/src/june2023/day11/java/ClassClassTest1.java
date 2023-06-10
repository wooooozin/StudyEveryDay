package june2023.day11.java;

import java.lang.reflect.*;
import java.util.Arrays;

class Person {
    // 멤버 변수
    public String name;
    public int age;

    // 생성자들
    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드 재정의
    public String toString() {
        return this.name;
    }
}

public class ClassClassTest1 {
    public static void main(String[] args) throws
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        // 클래스 이름으로 가져오기
        Class<?> c1 = Class.forName("june2023.day11.java.Person");

        // 모든 생성자 가져오기
        Constructor<?>[] constructors = c1.getConstructors();
        // 출력
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        // 결과
        // public june2023.day11.java.Person(java.lang.String,int)
        // public june2023.day11.java.Person(java.lang.String)
        // public june2023.day11.java.Person()

        // 모든 멤버변수 가져오기 - public만 가능 private면 안됨
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            System.out.print(field + " ");
            // public java.lang.String june2023.day11.java.Person.name public int june2023.day11.java.Person.age
        }
        // 모든 메서드 가져오기
        System.out.println();
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
