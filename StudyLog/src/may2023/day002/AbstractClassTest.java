package may2023.day002;

abstract class Animal {
    abstract void cry();
}

class Cat extends Animal {

    @Override
    void cry() {
        System.out.println("야옹야옹");
    }
}

class Dog extends Animal {

    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class AbstractClassTest {
    /*
    ### **추상 메소드(abstract method)**

    - 자식 클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메서드를 의미
    - 사용 목적은 추상 메서드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메서드를 구현하도록 하기 위함
    - 예를 들면 모듈처럼 중복되는 부분이나 공통적인 부분은 미리 다 만들어진 것을 사용하고,
    이를 받아 사용하는 쪽에서는 자신에게 필요한 부분만을 재정의하여 사용함으로써 생산성이 향상되고 배포 등이 쉬워지기 때문입니다.
    이러한 추상 메소드는 선언부만이 존재하며, 구현부는 작성되어 있지 않습니다.
    바로 이 작성되어 있지 않은 구현부를 자식 클래스에서 오버라이딩하여 사용하는 것입니다.

    ### **추상 클래스(abstract class)**

    자바에서는 하나 이상의 추상 메소드를 포함하는 클래스를 가리켜 추상 클래스(abstract class)라고 합니다.
    이러한 추상 클래스는 객체 지향 프로그래밍에서 중요한 특징인 다형성을 가지는 메소드의 집합을 정의할 수 있도록 해줍니다.
    즉, 반드시 사용되어야 하는 메소드를 추상 클래스에 추상 메소드로 선언해 놓으면, 이 클래스를 상속받는 모든 클래스에서는 이 추상 메소드를 반드시 재정의해야 합니다.
    추상 클래스는 추상 메소드를 포함하고 있다는 점을 제외하면, 일반 클래스와 모든 점이 같습니다.
    즉, 생성자와 필드, 일반 메소드도 포함할 수 있습니다.
     */

    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            void cry() {
                // Animal 익명클래스로 메서드를 사용은 가능
                System.out.println("익명클래스");
            }
        }; // ; 필수
        animal.cry();

        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.cry();
        dog.cry();
    }
}
