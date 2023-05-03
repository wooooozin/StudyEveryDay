package day002;

// 인터페이스란 ?
// 다중 상속이 되면 메서드 출처의 모호성 등 여러가지 문제가 발생
// 다중 상족의 이점을 이용하기 위해 인터페이스라는 것을 통해 다중 상속을 지원
// 자바에서 추상 클래스는 추상 메서드 + 생성자 + 필드 + 일반 메서드도 포함할 수 있음
// 하지만 인터페이스는 오로지 추상 메서드와 상수만을 포함할 수 있음

// 인터페이스의 모든 필드는 public static final이어야 하며, 모든 메소드는 public abstract이어야 함
// 이 부분은 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있음

// 인터페이스는 추상 클래스와 마찬가지로 자신이 직접 인스턴스를 생성할 수는 없습니다.
// 따라서 인터페이스가 포함하고 있는 추상 메소드를 구현해 줄 클래스를 작성해야만 합니다.

// 여러 인터페이스를 상속받을 수 있습니다.

interface AnimalInterface {
    public abstract void cry();
}

interface PetInterface {
    public abstract void play();
}

class Cat1 implements AnimalInterface, PetInterface {

    @Override
    public void cry() {
        System.out.println("ㅇ ㅑ 옹");
    }

    @Override
    public void play() {
        System.out.println("쥐잡고 놀기");
    }
}

class Dog1 implements AnimalInterface, PetInterface {

    public void cry() {
        System.out.println("멍멍!");
    }
    public void play() {
        System.out.println("원반 던지며 놀기");
    }

}


public class InterfaceTest {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        Dog1 dog1 = new Dog1();
        cat1.cry();
        dog1.cry();

        cat1.play();
        dog1.play();
    }
}
