package day002;


class Parent {
    public void printInfo() {
        System.out.println("parentPrintInfo");
    }
}

class Child extends Parent {
    public void printInfo() {
        System.out.println("childPrintInfo");
    }
}

class Brother extends Parent {
    public void printInfo() {
        System.out.println("brotherPrintInfo");
    }
}

public class PolymorphismTest {
    public static void main(String[] args) {
        /*
        다형성(polymorphism)이란?
        다형성(polymorphism)이란 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미합니다.
        자바에서는 이러한 다형성을 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여 구현하고 있습니다.
        다형성은 상속, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나입니다.
         */

        // 참조 변수의 다형성 - 다형성을 위해 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있음
        // 이때 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버 개수보다 같거나 적어야 참조 가능

        // 특정 타입의 참조 변수로는 당연히 같은 타입의 인스턴스를 참조할 수 있습니다.
        Parent parent = new Parent();
        // 그리고 부모 클래스 타입의 참조 변수로도 자식 클래스 타입의 인스턴스를 참조할 수 있습니다.
        Parent parent1 = new Child();
        Child child = new Child();
//        Child child1 = new Parent(); Child 참조변수가 실제 인스터스인 부모 멤버 개수보다 많을 수 있음
        // 클래스는 상속을 통해 확장될 수는 있어도 축소될 수는 없으므로, 자식 클래스에서 사용할 수 있는 멤버의 개수가 언제나 부모 클래스와 같거나 많게 됩니다.

        Parent p1 = new Parent();
        Parent p2 = new Child();
        Parent p3 = new Brother();
        Parent[] parents = {p1, p2, p3};
        for (Parent p : parents) {
            p.printInfo(); // 재정의된 메서드 각 참조변수에 따라 메서드 실행
        }
    }
}
